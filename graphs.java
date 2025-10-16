import java.util.*;
public class graphs {       // graph in the form of Adja centy list

    static class Edge{
        int src;
        int des;
        int wt;
        public Edge(int s, int d,int w){
            src = s;
            des = d;
            wt=w;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]){

        for(int i=0;i <graph.length;i++){
            graph[i]=new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0,2,2) );

        graph[1].add(new Edge(1,2,10));
        graph[1].add(new Edge(1,3,0));

        graph[2].add(new Edge(2,0,2));
        graph[2].add(new Edge(2,1,10));
        graph[2].add(new Edge(2,3,-1));

        graph[3].add(new Edge(3,1,1));
        graph[3].add(new Edge(3,2,2));
    }
    public static void main(String[] args) {
     int v = 4;

     ArrayList<Edge> graph[] = new ArrayList[v];
      createGraph(graph);

     //print 2's neighbour
      for(int i=0;i<graph.length;i++) {
          Edge e = graph[1].get(i);
          System.out.println(e.des+","+e.wt);
      }
    }
}
