import java.util.*;
public class recursion2 {
    public static int calpower(int x,int n){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        int xpower1=calpower(x,n-1);
        int xpower2 =x*xpower1;
        return xpower2;



    }
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter thr base number:");
        int x =sc.nextInt();
        System.out.println("Enter the power of the number:");
        int n =sc.nextInt();
        int res =calpower(x,n);
       System.out.println(res);
    }
}
