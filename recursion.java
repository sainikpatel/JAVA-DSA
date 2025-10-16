import java.util.*;
public class recursion {
    public static int printSum(int i,int n,int sum) {

        if(i==n){
            sum+=i;
            System.out.println(sum);
            return 0;
        }
        sum +=i;
        printSum(i+1,n,sum);
      return 0;
    }
    public static void main(String args[]){
        printSum(1,10,0);
    }
}