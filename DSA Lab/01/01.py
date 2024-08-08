# 1. Construct an AVL tree for a given set of elements which are stored in a file. And implement insert and delete operation on the constructed tree. Write contents of tree into a new file using in-order. 

class AVLTreeNode:
    def __init__(self, key):
        self.key = key
        self.left = None
        self.right = None
        self.height = 1

class AVLTree:
    def get_height(self, node):
        if not node:
            return 0
        return node.height

    def get_balance(self, node):
        if not node:
            return 0
        return self.get_height(node.left) - self.get_height(node.right)

    def right_rotate(self, y):
        x = y.left
        T2 = x.right
        x.right = y
        y.left = T2
        y.height = max(self.get_height(y.left), self.get_height(y.right)) + 1
        x.height = max(self.get_height(x.left), self.get_height(x.right)) + 1
        return x

    def left_rotate(self, x):
        y = x.right
        T2 = y.left
        y.left = x
        x.right = T2
        x.height = max(self.get_height(x.left), self.get_height(x.right)) + 1
        y.height = max(self.get_height(y.left), self.get_height(y.right)) + 1
        return y

    def insert(self, node, key):
        if not node:
            return AVLTreeNode(key)
        elif key < node.key:
            node.left = self.insert(node.left, key)
        else:
            node.right = self.insert(node.right, key)
        
        node.height = 1 + max(self.get_height(node.left), self.get_height(node.right))
        
        balance = self.get_balance(node)

        if balance > 1 and key < node.left.key:
            return self.right_rotate(node)
        
        if balance < -1 and key > node.right.key:
            return self.left_rotate(node)
        
        if balance > 1 and key > node.left.key:
            node.left = self.left_rotate(node.left)
            return self.right_rotate(node)
        
        if balance < -1 and key < node.right.key:
            node.right = self.right_rotate(node.right)
            return self.left_rotate(node)
        
        return node

    def min_value_node(self, node):
        current = node
        while current.left is not None:
            current = current.left
        return current

    def delete(self, root, key):
        if not root:
            return root

        if key < root.key:
            root.left = self.delete(root.left, key)
        elif key > root.key:
            root.right = self.delete(root.right, key)
        else:
            if root.left is None:
                return root.right
            elif root.right is None:
                return root.left
            
            temp = self.min_value_node(root.right)
            root.key = temp.key
            root.right = self.delete(root.right, temp.key)
        
        if root is None:
            return root

        root.height = max(self.get_height(root.left), self.get_height(root.right)) + 1

        balance = self.get_balance(root)

        if balance > 1 and self.get_balance(root.left) >= 0:
            return self.right_rotate(root)

        if balance < -1 and self.get_balance(root.right) <= 0:
            return self.left_rotate(root)

        if balance > 1 and self.get_balance(root.left) < 0:
            root.left = self.left_rotate(root.left)
            return self.right_rotate(root)

        if balance < -1 and self.get_balance(root.right) > 0:
            root.right = self.right_rotate(root.right)
            return self.left_rotate(root)
        
        return root

    def in_order_traversal(self, root, result):
        if root:
            self.in_order_traversal(root.left, result)
            result.append(root.key)
            self.in_order_traversal(root.right, result)

def read_elements_from_file(filename):
    with open(filename, 'r') as file:
        elements = file.read().split()
    return [int(e) for e in elements]

def write_elements_to_file(filename, elements):
    with open(filename, 'w') as file:
        for e in elements:
            file.write(f"{e}\n")

if __name__ == "__main__":
    avl_tree = AVLTree()
    root = None

    input_filename = "input.txt"
    output_filename = "output.txt"

    elements = read_elements_from_file(input_filename)

    for element in elements:
        root = avl_tree.insert(root, element)

    result = []
    avl_tree.in_order_traversal(root, result)
    write_elements_to_file(output_filename, result)

    # Insert and delete operations
    root = avl_tree.insert(root, 15)
    root = avl_tree.delete(root, 10)

    result = []
    avl_tree.in_order_traversal(root, result)
    write_elements_to_file("output_after_operations.txt", result)
