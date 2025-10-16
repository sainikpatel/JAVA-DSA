
import java.util.*;

public class spiralArray {

    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
                
            int T = sc.nextInt();
            for(int t=1;t<=T;t++){
                System.out.println("Case #"+t+":");
                int N = sc.nextInt();
                char[][] spiral = new char[N][N];

                for(int l=0;l<N;l++){
                   Arrays.fill(spiral[l], ' ');
                }
                int rowS =0;
                int colS = 0;
                int rowE = N-1;
                int colE = N-1;

                while(rowS <= rowE && colS <= colE){
                    for(int col = colS;col <= colE;col++){
                     spiral[rowS][col] ='*';   
                    }
                    rowS++;

                    for(int row = rowS;row<=rowE;row++){
                        spiral[row][colE] = '*';
                    }
                    colE--;
                    if(rowS <= rowE){
                    for(int col = colE;col>=colS;col--){
                        spiral[rowE][col] = '*';
                    
                    }
                    rowE--;
                    }
                            if(colS<=colE){
                    for(int row = rowE;row>=rowS;row++){
                        spiral[row][colS]='*';
                    }
                        colS++;
                            }
                }
            
                for(int i=0;i<spiral.length;i++){

                    for(int j=0;j<spiral.length;j++){
                        System.out.print(spiral[i][j]+" ");
                    }
                        System.out.println();
                }
            }
            
    }
}