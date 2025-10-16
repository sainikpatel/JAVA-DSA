import java.util.*;

public class CheapestFlightBellmanFord {

    static class Edge {
        int src, dest, wt;
        Edge(int src, int dest, int wt) {
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 4));
        graph[1].add(new Edge(1, 3, 7));
        graph[1].add(new Edge(1, 2, 1));
        graph[2].add(new Edge(2, 4, 3));
        graph[3].add(new Edge(3, 5, 1));
        graph[4].add(new Edge(4, 3, 2));
        graph[4].add(new Edge(4, 5, 5));
    }

    public static int bellmanFordKStops(ArrayList<Edge>[] graph, int V, int src, int dst, int K) {
        int[] dist = new int[V];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src] = 0;

        // Perform K+1 iterations to allow for K stops (K edges)
        for (int i = 0; i <= K; i++) {
            int[] temp = dist.clone();  // Use a temporary copy to avoid overwriting during relaxation
            for (int u = 0; u < V; u++) {
                for (Edge e : graph[u]) {
                    if (dist[e.src] != Integer.MAX_VALUE && dist[e.src] + e.wt < temp[e.dest]) {
                        temp[e.dest] = dist[e.src] + e.wt;
                    }
                }
            }
            dist = temp;
        }

        return dist[dst] == Integer.MAX_VALUE ? -1 : dist[dst];
    }

    public static void main(String[] args) {
        int V = 6;
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);

        int src = 0, dst = 5, K = 3;

        int result = bellmanFordKStops(graph, V, src, dst, K);
        System.out.println("Cheapest Price within " + K + " stops: " + result);
    }
}
