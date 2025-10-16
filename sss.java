import java.util.Scanner;
//power of two//*
public class sss {

    public static boolean isPowerOfTwo(int number){
        return (number > 0) && (number & (number -1)) == 0;
    }
public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
    System.out.println("enter any positive integer:");
        int number = sc.nextInt();

        if(isPowerOfTwo(number)){
            System.out.println(number + "is a power of two");
        }else{
            System.out.println(number + "is not a power of two ");
        }
}

}