import java.util.*;

public class countBinary {
    public static int countOnes(int num) {
        int count = 0;

        while (num != 0) {

            if ((num & 1) == 1) {
                count++;

            }
            num >>= 1;
        }
        return count;

    }
public static void main(String args[]){
        Scanner sc =new Scanner(System.in);

    System.out.println("enter a number:");
    int num =sc.nextInt();


    int count=countOnes(num);

    System.out.println("The no. of ones in the Binary form of "+num+" is: "+count);
}
}

