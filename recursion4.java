// To count the no. of paths to reach end in a matrix

//condition is either we move right or downward
public class recursion4 {

    public static int countPath(int i,int j,int n, int m){

        if(n==i || m==j){
            return 0;
        }
        if(i == n-1 && j == m-1){
            return 1;
        }

        //to move right
        int rightmove = countPath(i,j+1,n,m);


        //to move downward
        int downmove = countPath(i+1,j,n,m);
        return rightmove + downmove;
    }
    public static void main(String[] args){
        int n=3;
        int  m=4;
        int res = countPath(0,0,n,m);
        System.out.println("Total no. of paths are "+res);
    }
}
