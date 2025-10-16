public class powerOfNum {
    public static int placetiles(int n, int m){
        if(n==m){
            return 2;
        }
        if(n<m){
            return 1;
        }
        int horizontal= placetiles(n-1,m);

        int vertical = placetiles(n-m,m);
        return horizontal + vertical;
    }
    public static void main(String[] args){
        int n,m;
        n=4;
        m=2;
        int res = placetiles(n,m);
        System.out.println("Total no. of ways of placing tiles for given matrix is: "+res);
    }
}
