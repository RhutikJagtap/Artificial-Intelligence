# Write A Program to Implement Depth  First Search Traversal
graph = {
    'A': ['B', 'C'],
    'B': ['D', 'E'],
    'C': ['F'],
    'D': [],
    'E': ['F'],
    'F': []
}

visited = set()  # set to keep track of visited nodes


def dfs(visited, graph, node):
    if node not in visited:
        print(node)
    visited.add(node)
    for neighbour in graph[node]:
        #  print("neighbour is now ", neighbour)
        dfs(visited, graph, neighbour)  # recursive Function call


dfs(visited, graph, 'A')
