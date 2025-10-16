import java.util.*;
public class dj {

    static class Edge {
        int src;
        int dest;
        int wt;
        Edge(int src, int dest, int wt) {
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }
    }
    public static void createGraph(ArrayList<Edge> graph[]){
        for(int i=0;i<graph.length;i++) {
            graph[i] = new ArrayList<Edge>();
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
      static class pair  implements Comparable<pair>{
        int n;
        int path;
        pair(int n, int path){
            this.n = n;
            this.path = path;
        }
        @Override
        public int compareTo(pair p2){
            return this.path - p2.path;
        }
      }

      // O(E+ElogE)
      // O(ElogV) time complexity
       public static void dijkstra(ArrayList<Edge> graph[],int src,int V){    // shoortest path
        PriorityQueue<pair> pq = new PriorityQueue<>();
        int dist[] = new int[V];
        for(int i=0;i<V;i++){
            if(i!= src){
                dist[i] = Integer.MAX_VALUE;
            }
        }
        boolean vis[] = new boolean[V];

        pq.add(new pair(src, 0));
        while (!pq.isEmpty()) {
            pair curr = pq.remove();
            if (!vis[curr.n]) {
                vis[curr.n] = true;

                for(int i=0;i<graph[curr.n].size();i++){
                    Edge e = graph[curr.n].get(i);
                    int u = e.src;
                    int v = e.dest;
                    if(dist[u]+e.wt < dist[v]){
                        dist[v] = dist[u] + e.wt;
                        pq.add(new pair(v,dist[v]));
                    }
                }
            }
            
        }
        for(int i=0;i<V;i++){
            System.out.print(dist[i] + " ");
        }
        System.out.println();
       } 

    public static void main(String[] args) {
        int V = 6;
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);
        dijkstra(graph,0,V);
    }
}