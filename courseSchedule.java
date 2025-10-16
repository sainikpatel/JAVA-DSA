import java.util.*;

public class courseSchedule{

    public static boolean canFinish(int noOfCourses,int[][] prerequisites){
        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0;i<noOfCourses;i++){
            adj.add(new ArrayList<>());
        }

        for(int[] pre : prerequisites){
           adj.get(pre[1]).add(pre[0]); // bi->ai
        }
        int[] vis = new int[noOfCourses]; // 0=unvisited , 1 = visiting, 2 = visited

        for(int i =0;i<noOfCourses;i++){
            if(vis[i]==0){
            if(dfs(adj,vis , i))
            return false; // cycle detected
            }
        }
          return true; //no cycle,can finish all the courses
        }

        public static boolean dfs(List<List<Integer>> adj ,int[] vis,int course ){
            if(vis[course]==1) return true;  // cycle detected
            if(vis[course]==2) return false;

             vis[course] = 1;// mark as visited

             for(int neighbour : adj.get(course)){
                if(dfs(adj, vis, neighbour))
                return true;
             }
             vis[course] = 2;
             return false;

        }
    public static void main(String[] args){
        int noOfCourses = 4;
        int[][] prerequisites = {{1,0},{2,1},{1,2}}; // cycle exist for the given input
        System.out.println(canFinish(noOfCourses, prerequisites));

    }
}