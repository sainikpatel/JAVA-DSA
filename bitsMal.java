 import java.util.*;
public class bitsMal {
    public static int ToggleBit(int number, int pos){

        int mask = 1<< pos;
        return number ^ mask;

    }
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter any number:");
        int number = sc.nextInt();

        System.out.println("enter the position to toggle bit:");
        int pos = sc.nextInt();
        int result = ToggleBit(number,pos);
        System.out.println("number after toggling the bit positon to 3"+pos+" is:"+result);

    }
}
