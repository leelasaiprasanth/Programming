import heapq
import time
import random

class GraphMatrix:
    def __init__(self, vertices):
        self.vertices = vertices
        self.adj_matrix = [[float('inf')] * vertices for _ in range(vertices)]

    def add_edge(self, u, v, weight):
        self.adj_matrix[u][v] = weight
        self.adj_matrix[v][u] = weight  # Assuming undirected graph

    def dijkstra(self, start):
        distances = [float('inf')] * self.vertices
        distances[start] = 0
        visited = [False] * self.vertices
        min_heap = [(0, start)]

        while min_heap:
            current_distance, u = heapq.heappop(min_heap)
            if visited[u]:
                continue
            visited[u] = True
            for v, weight in enumerate(self.adj_matrix[u]):
                if weight < float('inf') and not visited[v]:
                    distance = current_distance + weight
                    if distance < distances[v]:
                        distances[v] = distance
                        heapq.heappush(min_heap, (distance, v))
        return distances

class GraphList:
    def __init__(self, vertices):
        self.vertices = vertices
        self.adj_list = [[] for _ in range(vertices)]

    def add_edge(self, u, v, weight):
        self.adj_list[u].append((v, weight))
        self.adj_list[v].append((u, weight))  # Assuming undirected graph

    def dijkstra(self, start):
        distances = [float('inf')] * self.vertices
        distances[start] = 0
        visited = [False] * self.vertices
        min_heap = [(0, start)]

        while min_heap:
            current_distance, u = heapq.heappop(min_heap)
            if visited[u]:
                continue
            visited[u] = True
            for v, weight in self.adj_list[u]:
                if not visited[v]:
                    distance = current_distance + weight
                    if distance < distances[v]:
                        distances[v] = distance
                        heapq.heappush(min_heap, (distance, v))
        return distances

def generate_random_graph(vertices, edges):
    graph_matrix = GraphMatrix(vertices)
    graph_list = GraphList(vertices)
    for _ in range(edges):
        u = random.randint(0, vertices - 1)
        v = random.randint(0, vertices - 1)
        if u != v:
            weight = random.randint(1, 10)
            graph_matrix.add_edge(u, v, weight)
            graph_list.add_edge(u, v, weight)
    return graph_matrix, graph_list

def measure_time(sort_function, *args):
    start_time = time.time()
    sort_function(*args)
    end_time = time.time()
    return end_time - start_time

if __name__ == "__main__":
    vertices = 100
    edges = 300

    # Generate random graph
    graph_matrix, graph_list = generate_random_graph(vertices, edges)

    # Measure and compare performance
    start_node = 0

    time_matrix = measure_time(graph_matrix.dijkstra, start_node)
    time_list = measure_time(graph_list.dijkstra, start_node)

    print(f"Execution time for Dijkstra's algorithm using adjacency matrix: {time_matrix:.6f} seconds")
    print(f"Execution time for Dijkstra's algorithm using adjacency list: {time_list:.6f} seconds")
