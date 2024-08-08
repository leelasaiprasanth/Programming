# 2. Construct B-Tree an order of 5 with a set of 10 random elements stored in array. Implement searching, insertion and deletion operations. 


class BTreeNode:
    def __init__(self, t, leaf=False):
        self.t = t
        self.leaf = leaf
        self.keys = []
        self.children = []

class BTree:
    def __init__(self, t):
        self.root = BTreeNode(t, True)
        self.t = t

    def traverse(self):
        self._traverse(self.root)

    def _traverse(self, node):
        for i in range(len(node.keys)):
            if not node.leaf:
                self._traverse(node.children[i])
            print(node.keys[i], end=' ')
        if not node.leaf:
            self._traverse(node.children[len(node.keys)])

    def search(self, key):
        return self._search(self.root, key)

    def _search(self, node, key):
        i = 0
        while i < len(node.keys) and key > node.keys[i]:
            i += 1
        if i < len(node.keys) and key == node.keys[i]:
            return (node, i)
        elif node.leaf:
            return None
        else:
            return self._search(node.children[i], key)

    def insert(self, key):
        root = self.root
        if len(root.keys) == 2 * self.t - 1:
            new_root = BTreeNode(self.t, False)
            new_root.children.append(self.root)
            self._split_child(new_root, 0, self.root)
            self.root = new_root
            self._insert_non_full(new_root, key)
        else:
            self._insert_non_full(root, key)

    def _split_child(self, parent, i, full_child):
        t = self.t
        new_child = BTreeNode(t, full_child.leaf)
        parent.children.insert(i + 1, new_child)
        parent.keys.insert(i, full_child.keys[t - 1])
        new_child.keys = full_child.keys[t:(2 * t - 1)]
        full_child.keys = full_child.keys[0:(t - 1)]
        if not full_child.leaf:
            new_child.children = full_child.children[t:(2 * t)]
            full_child.children = full_child.children[0:t]

    def _insert_non_full(self, node, key):
        i = len(node.keys) - 1
        if node.leaf:
            node.keys.append(0)
            while i >= 0 and key < node.keys[i]:
                node.keys[i + 1] = node.keys[i]
                i -= 1
            node.keys[i + 1] = key
        else:
            while i >= 0 and key < node.keys[i]:
                i -= 1
            i += 1
            if len(node.children[i].keys) == 2 * self.t - 1:
                self._split_child(node, i, node.children[i])
                if key > node.keys[i]:
                    i += 1
            self._insert_non_full(node.children[i], key)

    def delete(self, key):
        self._delete(self.root, key)
        if len(self.root.keys) == 0:
            if not self.root.leaf:
                self.root = self.root.children[0]
            else:
                self.root = None

    def _delete(self, node, key):
        t = self.t
        i = 0
        while i < len(node.keys) and key > node.keys[i]:
            i += 1
        if i < len(node.keys) and key == node.keys[i]:
            if node.leaf:
                node.keys.pop(i)
            else:
                if len(node.children[i].keys) >= t:
                    node.keys[i] = self._get_predecessor(node, i)
                    self._delete(node.children[i], node.keys[i])
                elif len(node.children[i + 1].keys) >= t:
                    node.keys[i] = self._get_successor(node, i)
                    self._delete(node.children[i + 1], node.keys[i])
                else:
                    self._merge(node, i)
                    self._delete(node.children[i], key)
        else:
            if node.leaf:
                print(f"Key {key} is not in the tree.")
                return
            flag = (i == len(node.keys))
            if len(node.children[i].keys) < t:
                self._fill(node, i)
            if flag and i > len(node.keys):
                self._delete(node.children[i - 1], key)
            else:
                self._delete(node.children[i], key)

    def _get_predecessor(self, node, i):
        cur = node.children[i]
        while not cur.leaf:
            cur = cur.children[-1]
        return cur.keys[-1]

    def _get_successor(self, node, i):
        cur = node.children[i + 1]
        while not cur.leaf:
            cur = cur.children[0]
        return cur.keys[0]

    def _fill(self, node, i):
        t = self.t
        if i != 0 and len(node.children[i - 1].keys) >= t:
            self._borrow_from_prev(node, i)
        elif i != len(node.keys) and len(node.children[i + 1].keys) >= t:
            self._borrow_from_next(node, i)
        else:
            if i != len(node.keys):
                self._merge(node, i)
            else:
                self._merge(node, i - 1)

    def _borrow_from_prev(self, node, i):
        child = node.children[i]
        sibling = node.children[i - 1]
        child.keys.insert(0, node.keys[i - 1])
        if not child.leaf:
            child.children.insert(0, sibling.children.pop(-1))
        node.keys[i - 1] = sibling.keys.pop(-1)

    def _borrow_from_next(self, node, i):
        child = node.children[i]
        sibling = node.children[i + 1]
        child.keys.append(node.keys[i])
        if not child.leaf:
            child.children.append(sibling.children.pop(0))
        node.keys[i] = sibling.keys.pop(0)

    def _merge(self, node, i):
        child = node.children[i]
        sibling = node.children.pop(i + 1)
        child.keys.append(node.keys.pop(i))
        child.keys.extend(sibling.keys)
        if not child.leaf:
            child.children.extend(sibling.children)

# Sample usage
if __name__ == "__main__":
    btree = BTree(3)  # Order 5 (t=3)

    elements = [10, 20, 5, 6, 12, 30, 7, 17, 2, 25]

    for elem in elements:
        btree.insert(elem)

    print("B-Tree elements in sorted order:")
    btree.traverse()
    print()

    search_key = 17
    result = btree.search(search_key)
    if result:
        print(f"Key {search_key} found in the B-Tree.")
    else:
        print(f"Key {search_key} not found in the B-Tree.")

    delete_key = 6
    print(f"Deleting key {delete_key}...")
    btree.delete(delete_key)
    print("B-Tree elements in sorted order after deletion:")
    btree.traverse()
    print()
