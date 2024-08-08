class Graph:
    def __init__(self, vertices):
        self.vertices = vertices
        self.adj_list = [[] for _ in range(vertices)]

    def add_edge(self, u, v):
        self.adj_list[u].append(v)
        self.adj_list[v].append(u)

    def biconnected_components(self):
        def dfs(u, parent):
            nonlocal time
            children = 0
            visited[u] = True
            discovery[u] = low[u] = time
            time += 1
            stack.append((parent, u))

            for v in self.adj_list[u]:
                if not visited[v]:
                    children += 1
                    dfs(v, u)
                    low[u] = min(low[u], low[v])

                    if (parent == -1 and children > 1) or (parent != -1 and low[v] >= discovery[u]):
                        component = []
                        while stack[-1] != (u, v):
                            component.append(stack.pop())
                        component.append(stack.pop())
                        components.append(component)

                elif v != parent and discovery[u] > discovery[v]:
                    low[u] = min(low[u], discovery[v])
                    stack.append((u, v))

        visited = [False] * self.vertices
        discovery = [float('inf')] * self.vertices
        low = [float('inf')] * self.vertices
        stack = []
        components = []
        time = 0

        for i in range(self.vertices):
            if not visited[i]:
                dfs(i, -1)

        return components

    def print_biconnected_components(self):
        components = self.biconnected_components()
        print("Bi-connected components:")
        for component in components:
            print(component)

if __name__ == "__main__":
    # Create a graph
    graph = Graph(5)
    graph.add_edge(0, 1)
    graph.add_edge(1, 2)
    graph.add_edge(2, 0)
    graph.add_edge(1, 3)
    graph.add_edge(3, 4)
    graph.add_edge(4, 1)

    graph.print_biconnected_components()
