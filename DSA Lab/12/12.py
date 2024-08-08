import math
import heapq

class Node:
    def __init__(self, path, cost, level, bound):
        self.path = path
        self.cost = cost
        self.level = level
        self.bound = bound

    def __lt__(self, other):
        return self.bound < other.bound

def calculate_bound(node, dist):
    n = len(dist)
    cost = node.cost
    level = node.level
    if level == n - 1:
        return cost + dist[node.path[-1]][0]
    
    bound = cost
    for i in range(level + 1):
        bound += (dist[node.path[i]][node.path[i + 1]] - dist[node.path[i]][node.path[i - 1]]) / 2
    bound += sum(min(dist[i]) for i in range(n))
    return bound

def tsp_branch_and_bound(dist):
    n = len(dist)
    pq = []
    root = Node(path=[0], cost=0, level=0, bound=calculate_bound(Node(path=[0], cost=0, level=0, bound=0), dist))
    heapq.heappush(pq, root)
    min_cost = float('inf')
    best_path = None

    while pq:
        node = heapq.heappop(pq)
        
        if node.level == n - 1:
            if node.cost + dist[node.path[-1]][0] < min_cost:
                min_cost = node.cost + dist[node.path[-1]][0]
                best_path = node.path + [0]
        else:
            for i in range(n):
                if i not in node.path:
                    new_path = node.path + [i]
                    new_cost = node.cost + dist[node.path[-1]][i]
                    new_node = Node(path=new_path, cost=new_cost, level=node.level + 1, bound=calculate_bound(Node(path=new_path, cost=new_cost, level=node.level + 1, bound=0), dist))
                    if new_node.bound < min_cost:
                        heapq.heappush(pq, new_node)
    
    return min_cost, best_path

if __name__ == "__main__":
    # Example distance matrix
    dist = [
        [0, 10, 15, 20],
        [10, 0, 35, 25],
        [15, 35, 0, 30],
        [20, 25, 30, 0]
    ]

    min_cost, best_path = tsp_branch_and_bound(dist)
    print(f"Minimum cost: {min_cost}")
    print(f"Best path: {best_path}")
