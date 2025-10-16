import java.util.*;

public class main{
    public static List<Integer> eventualSafeNodes(int[][] graph) {
        int n = graph.length;
        int[] vis = new int[n]; // 0 = unvisited, 1 = visiting, 2 = safe
        List<Integer> safeNodes = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (dfs(i, graph, vis)) {
                safeNodes.add(i);
            }
        }

        return safeNodes;
    }

    public static boolean dfs(int node, int[][] graph, int[] vis) {
        if (vis[node] != 0) {
            return vis[node] == 2; // return true if node is safe
        }

        vis[node] = 1; // mark as visiting
        for (int neighbor : graph[node]) {
            if (!dfs(neighbor, graph, vis)) {
                return false; // found a cycle
            }
        }

        vis[node] = 2; // mark as safe
        return true;
    }

    // Test the function
    public static void main(String[] args) {
        
        int[][] graph = {{1,2},{2,3},{5},{0},{5},{},{}};

        List<Integer> result = eventualSafeNodes(graph);
        System.out.println(result); // Output: [2, 4, 5, 6]
    }
}