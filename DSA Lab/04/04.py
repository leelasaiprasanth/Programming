from collections import deque

class Graph:
    def __init__(self, adjacency_matrix=None, adjacency_list=None):
        self.adjacency_matrix = adjacency_matrix
        self.adjacency_list = adjacency_list

    def bfs_matrix(self, start):
        visited = set()
        queue = deque([start])
        result = []

        while queue:
            node = queue.popleft()
            if node not in visited:
                visited.add(node)
                result.append(node)
                for i, is_connected in enumerate(self.adjacency_matrix[node]):
                    if is_connected and i not in visited:
                        queue.append(i)
        
        return result

    def dfs_matrix(self, start):
        visited = set()
        result = []

        def dfs(node):
            if node not in visited:
                visited.add(node)
                result.append(node)
                for i, is_connected in enumerate(self.adjacency_matrix[node]):
                    if is_connected and i not in visited:
                        dfs(i)
        
        dfs(start)
        return result

    def bfs_list(self, start):
        visited = set()
        queue = deque([start])
        result = []

        while queue:
            node = queue.popleft()
            if node not in visited:
                visited.add(node)
                result.append(node)
                for neighbor in self.adjacency_list[node]:
                    if neighbor not in visited:
                        queue.append(neighbor)
        
        return result

    def dfs_list(self, start):
        visited = set()
        result = []

        def dfs(node):
            if node not in visited:
                visited.add(node)
                result.append(node)
                for neighbor in self.adjacency_list[node]:
                    if neighbor not in visited:
                        dfs(neighbor)
        
        dfs(start)
        return result


if __name__ == "__main__":
    # Example graph represented as an adjacency matrix
    adjacency_matrix = [
        [0, 1, 1, 0],
        [1, 0, 1, 1],
        [1, 1, 0, 1],
        [0, 1, 1, 0]
    ]

    # Example graph represented as an adjacency list
    adjacency_list = {
        0: [1, 2],
        1: [0, 2, 3],
        2: [0, 1, 3],
        3: [1, 2]
    }

    graph_matrix = Graph(adjacency_matrix=adjacency_matrix)
    graph_list = Graph(adjacency_list=adjacency_list)

    start_node = 0

    # BFT and DFT using adjacency matrix
    print("BFT using adjacency matrix:", graph_matrix.bfs_matrix(start_node))
    print("DFT using adjacency matrix:", graph_matrix.dfs_matrix(start_node))

    # BFT and DFT using adjacency list
    print("BFT using adjacency list:", graph_list.bfs_list(start_node))
    print("DFT using adjacency list:", graph_list.dfs_list(start_node))
