import java.util.*;
public class bits {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int n=5;
         int pos=1;
        int bitmask= 1<<pos;
      //  if((bitmask & n) == 0){
        //    System.out.println("bit was zero");
      //  }else{
        //    System.out.println("bit was not zero");
        //set bit
        int nu = bitmask | n;
        System.out.println(nu);

    }
}
