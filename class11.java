import java.util.*;

public class class11{
    static class Edge{
        int src;
        int dest;

        Edge(int s,int d){
            src = s;
            dest = d;
        }
    }
    public static void createGraph(ArrayList<Edge> graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i] = new ArrayList<Edge>();
        }
      graph[0].add(new Edge(0, 1));
      graph[0].add(new Edge(0, 2));
      graph[0].add(new Edge(0, 3));
      graph[1].add(new Edge(1, 0));
      graph[1].add(new Edge(1, 2));
      graph[2].add(new Edge(2, 0));
      graph[2].add(new Edge(2, 1));
      graph[3].add(new Edge(3, 0));
      graph[3].add(new Edge(3, 4));
    }

    // cycle detection for undirected graph
    public static boolean isCucleUndirected(ArrayList<Edge> graph[],boolean vis[],int curr,int par){
        vis[curr] =  true;
        for(int i=0;i<graph[curr].size();i++){
            Edge e = graph[curr].get(i);
            if(vis[e.dest] && e.dest != par){
                return true;
            }
            else if(!vis[e.dest]){
                isCucleUndirected(graph,vis,e.dest,curr);
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args){
        
        int v = 5;
        ArrayList<Edge> graph[] = new ArrayList[v];
        createGraph(graph);

        System.out.println(isCucleUndirected(graph,new boolean[v],0,-1));
    }
}