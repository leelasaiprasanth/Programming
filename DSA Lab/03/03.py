import heapq

class MinHeap:
    def __init__(self):
        self.heap = []

    def insert(self, key):
        heapq.heappush(self.heap, key)

    def delete(self, key):
        try:
            # Find the index of the element to be deleted
            index = self.heap.index(key)
            # Replace the element to be deleted with the last element
            self.heap[index] = self.heap[-1]
            self.heap.pop()
            # Re-heapify the heap
            if index < len(self.heap):
                self._heapify_up(index)
                self._heapify_down(index)
        except ValueError:
            print(f"Key {key} not found in the Min Heap.")

    def _heapify_up(self, index):
        parent = (index - 1) // 2
        if index > 0 and self.heap[index] < self.heap[parent]:
            self.heap[index], self.heap[parent] = self.heap[parent], self.heap[index]
            self._heapify_up(parent)

    def _heapify_down(self, index):
        smallest = index
        left = 2 * index + 1
        right = 2 * index + 2
        if left < len(self.heap) and self.heap[left] < self.heap[smallest]:
            smallest = left
        if right < len(self.heap) and self.heap[right] < self.heap[smallest]:
            smallest = right
        if smallest != index:
            self.heap[index], self.heap[smallest] = self.heap[smallest], self.heap[index]
            self._heapify_down(smallest)

    def display(self):
        return self.heap


class MaxHeap:
    def __init__(self):
        self.heap = []

    def insert(self, key):
        heapq.heappush(self.heap, -key)

    def delete(self, key):
        try:
            # Find the index of the element to be deleted
            index = self.heap.index(-key)
            # Replace the element to be deleted with the last element
            self.heap[index] = self.heap[-1]
            self.heap.pop()
            # Re-heapify the heap
            if index < len(self.heap):
                self._heapify_up(index)
                self._heapify_down(index)
        except ValueError:
            print(f"Key {key} not found in the Max Heap.")

    def _heapify_up(self, index):
        parent = (index - 1) // 2
        if index > 0 and self.heap[index] > self.heap[parent]:
            self.heap[index], self.heap[parent] = self.heap[parent], self.heap[index]
            self._heapify_up(parent)

    def _heapify_down(self, index):
        largest = index
        left = 2 * index + 1
        right = 2 * index + 2
        if left < len(self.heap) and self.heap[left] > self.heap[largest]:
            largest = left
        if right < len(self.heap) and self.heap[right] > self.heap[largest]:
            largest = right
        if largest != index:
            self.heap[index], self.heap[largest] = self.heap[largest], self.heap[index]
            self._heapify_down(largest)

    def display(self):
        return [-x for x in self.heap]


if __name__ == "__main__":
    min_heap = MinHeap()
    max_heap = MaxHeap()

    # Example elements
    min_elements = [10, 20, 5, 6, 12, 30, 7, 17, 2, 25]
    max_elements = [10, 20, 5, 6, 12, 30, 7, 17, 2, 25]

    # Insert elements into Min Heap
    for elem in min_elements:
        min_heap.insert(elem)

    # Insert elements into Max Heap
    for elem in max_elements:
        max_heap.insert(elem)

    print("Min Heap after insertion:")
    print(min_heap.display())

    print("Max Heap after insertion:")
    print(max_heap.display())

    # Delete elements
    min_heap.delete(6)
    max_heap.delete(17)

    print("Min Heap after deleting 6:")
    print(min_heap.display())

    print("Max Heap after deleting 17:")
    print(max_heap.display())
