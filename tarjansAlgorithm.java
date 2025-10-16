import java.util.*;

public class tarjansAlgorithm {
    static class Edge {
        int src, dest;
        Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    public static void createGraph(int v, ArrayList<Edge>[] graph) {
        for (int i = 0; i < v; i++) {
            graph[i] = new ArrayList<>();
        }

        // Undirected edges (use correct src and dest)
        graph[0].add(new Edge(0, 1));
        graph[1].add(new Edge(1, 0));

        graph[1].add(new Edge(1, 2));
        graph[2].add(new Edge(2, 1));

        graph[2].add(new Edge(2, 0));
        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 3));
        graph[3].add(new Edge(3, 1));

        graph[3].add(new Edge(3, 4));
        graph[4].add(new Edge(4, 3));
    }

    public static void dfs(ArrayList<Edge>[] graph, int curr, int parent, boolean[] vis, int[] dt, int[] low, int[] time) {
        vis[curr] = true;
        dt[curr] = low[curr] = time[0]++;

        for (Edge e : graph[curr]) {
            if (e.dest == parent) continue;

            if (!vis[e.dest]) {
                dfs(graph, e.dest, curr, vis, dt, low, time);
                low[curr] = Math.min(low[curr], low[e.dest]);

                if (low[e.dest] > dt[curr]) {
                    System.out.println("Bridge: " + curr + " - " + e.dest);
                }
            } else {
                low[curr] = Math.min(low[curr], dt[e.dest]);
            }
        }
    }

    public static void getBridge(ArrayList<Edge>[] graph, int v) {
        boolean[] vis = new boolean[v];
        int[] dt = new int[v];  // discovery time
        int[] low = new int[v];  // lowest dt
        int[] time = {0}; // pass-by-reference trick

        for (int i = 0; i < v; i++) {
            if (!vis[i]) {
                dfs(graph, i, -1, vis, dt, low, time);
            }
        }
    }

    public static void main(String[] args) {
        int v = 5;
        ArrayList<Edge>[] graph = new ArrayList[v];
        createGraph(v, graph);
        getBridge(graph, v);
    }
}
