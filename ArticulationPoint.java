import java.util.*;

public class ArticulationPoint {
    static class Edge {
        int src;
        int dest;

        public Edge(int src, int dest) {
            this.src = src;
            this.dest = dest;
        }
    }

    static int time = 0;

    public static void createGraph(ArrayList<Edge>[] graph, int v) {
        for (int i = 0; i < v; i++) {
            graph[i] = new ArrayList<>();
        }

        // Creating an undirected graph
        graph[0].add(new Edge(0, 1));
        graph[1].add(new Edge(1, 0));

        graph[0].add(new Edge(0, 2));
        graph[2].add(new Edge(2, 0));

        graph[0].add(new Edge(0, 3));
        graph[3].add(new Edge(3, 0));

        graph[1].add(new Edge(1, 2));
        graph[2].add(new Edge(2, 1));

        graph[3].add(new Edge(3, 4));
        graph[4].add(new Edge(4, 3));
    }

    public static void dfs(ArrayList<Edge>[] graph, int curr, int parent, int[] dt, int[] lowdt, boolean[] vis, boolean[] isArticulation) {
        vis[curr] = true;
        dt[curr] = lowdt[curr] = ++time;
        int child = 0;

        for (Edge e : graph[curr]) {
            if (e.dest == parent) continue;

            if (vis[e.dest]) {
                lowdt[curr] = Math.min(lowdt[curr], dt[e.dest]);
            } else {
                dfs(graph, e.dest, curr, dt, lowdt, vis, isArticulation);
                lowdt[curr] = Math.min(lowdt[curr], lowdt[e.dest]);

                if (parent != -1 && lowdt[e.dest] >= dt[curr]) {
                    isArticulation[curr] = true;
                }
                child++;
            }
        }

        if (parent == -1 && child > 1) {
            isArticulation[curr] = true;
        }
    }

    public static void getArticulationPoints(ArrayList<Edge>[] graph, int v) {
        boolean[] vis = new boolean[v];
        int[] dt = new int[v];
        int[] lowdt = new int[v];
        boolean[] isArticulation = new boolean[v];

        for (int i = 0; i < v; i++) {
            if (!vis[i]) {
                dfs(graph, i, -1, dt, lowdt, vis, isArticulation);
            }
        }

        System.out.print("Articulation Points: ");
        for (int i = 0; i < v; i++) {
            if (isArticulation[i]) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        int v = 5;
        ArrayList<Edge>[] graph = new ArrayList[v];
        createGraph(graph, v);
        getArticulationPoints(graph, v);
    }
}
