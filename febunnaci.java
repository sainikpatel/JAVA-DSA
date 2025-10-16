public class febunnaci {
    public static int febunnaciSeries(int x,int y, int n){
        if(n==0){
            return 0;
        }
        int z =x+y;
        System.out.println(z);
        febunnaciSeries(y,z,n-1);   // x becomes y & y becomes z

           return 0;
    }
    public static void main(String args[]){
        System.out.println("0");
        System.out.println("1");


      int result=  febunnaciSeries(0,1,6);

    }
}
