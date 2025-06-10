import java.util.*;

public class {
    public static void dfs(int node, boolean[] visited, List<List<Integer>> adj, List<Integer> result) {
        visited[node] = true;
        result.add(node);

        // Traverse all unvisited neighbors in insertion order
        for (int neighbor : adj.get(node)) {
            if (!visited[neighbor]) {
                dfs(neighbor, visited, adj, result);
            }
        }
    }

    public static List<Integer> dfsOfGraph(int V, List<List<Integer>> adj) {
        boolean[] visited = new boolean[V];
        List<Integer> result = new ArrayList<>();

        // Perform DFS starting from vertex 0
        dfs(0, visited, adj, result);

        return result;
    }

    public static void main(String[] args) {
        int V = 5;
        List<List<Integer>> adj = new ArrayList<>();

        // Initialize the adjacency list
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        // Add edges (undirected)
        adj.get(0).add(1);
        adj.get(0).add(2);
        adj.get(1).add(0);
        adj.get(1).add(2);
        adj.get(2).add(0);
        adj.get(2).add(1);
        adj.get(2).add(3);
        adj.get(2).add(4);
        adj.get(3).add(2);
        adj.get(4).add(2);

        List<Integer> dfsResult = dfsOfGraph(V, adj);
        System.out.println("DFS Traversal: " + dfsResult);
    }
}
