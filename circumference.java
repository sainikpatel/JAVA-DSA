import java.util.Scanner;
public class circumference{
    public static int callguests(int n){
        if(n<=1){
            return 1;
        }
        //single
        int way1 = callguests(n-1);

        //pairs
        int way2 = (n-1) * callguests(n-2);

        return way1 +way2;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of guests you want to invite: ");
        int n = sc.nextInt();
        int ress = callguests(n);
        System.out.println("total ways are: "+ress);
    }
}