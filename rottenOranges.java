import java.util.*;
import java.util.Queue;
 public class rottenOranges{
           public static int RottenOranges(int[][] grid){
            if(grid == null || grid.length ==0)return -1;

            int rows = grid.length;
            int cols = grid[0].length;
            Queue<int[]> queue = new LinkedList<>();
            int freshOranges = 0; // Declare and initialize freshOranges

              // add all rotten oranges to queue and count fresh ones
              for(int i=0;i<rows;i++){
                for(int j=0;j<cols;j++){
                    if(grid[i][j]==2){
                        queue.add(new int[]{i,j});
                    }
                    else if(grid[i][j]==1){
                        freshOranges++;
                    }
                }
              }

              if(freshOranges == 0)return 0;

              int minutes =0;
              int[][] directions = {{1,0},{-1,0},{0,1},{0,-1}};

              //Bfs
              while(!queue.isEmpty()){
                int size = queue.size();
                boolean rotten =false;

                for(int i=0;i<size;i++){
                    int[] orange = queue.poll();
                    int x =orange[0];
                    int y = orange[1];

                    for(int[] dir : directions){
                        int nx = x + dir[0];
                        int ny = y + dir[1];

                        if(nx>=0 && ny >=0 && nx < rows && ny < cols && grid[nx][ny]==1){
                            grid[nx][ny] = 2;
                            freshOranges--;
                            queue.add(new int[]{nx,ny});
                            rotten = true;
                        }
                    }
                } 
                if(rotten) minutes++;
              }
              if(freshOranges ==0){
                return minutes;
              }else{
                return -1;
              }
             }

             // no.of islands
             public static int noOfIslands(char[][] grid){
                if(grid.length==0||grid == null) return 0;

                int rows = grid.length;
                int cols = grid[0].length;
                int islands =0;

                for(int i=0;i<rows;i++){
                    for(int j=0;j<cols;j++){
                        if(grid[i][j]=='1'){
                            islands++;
                            dfs(grid,i,j);
                        }
                    }
                }
                return islands;
             }

             public static void dfs(char[][] grid,int i, int j){
                // boundary check
                if(i<0 || j<0 || i>=grid.length || j>= grid[0].length || grid[i][j]=='0') return;

                //mark as visited
                grid[i][j] ='0';

                //move in all directions

                dfs(grid,i+1,j);//down
                dfs(grid,i-1,j);//up
                dfs(grid,i,j+1);//right
                dfs(grid,i,j-1);//left

             }
             public static void main(String[] args){
               // int[][] Grid = {{2,1,1},{1,1,0},{0,1,1}};
                //System.out.println(RottenOranges(Grid));


                char[][] grid ={{'1','1','0','0','0'},
                {'1','1','0','0','0'},
                {'0','0','1','0','0'},
                {'0','0','0','1','1'}
            };
            System.out.println(noOfIslands(grid));
             }
        
    }
