import java.util.*;
public class string1 {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        String name1= sc.nextLine();
        String name2 =sc.nextLine();
       // String fullname =a+b;
      //  System.out.println(fullname.length());
        //to print each element
        //charAt
       // for(int i=0;i<fullname.length();i++){
        //    System.out.println( fullname.charAt(i));
      //  }
        //compare two strings
        if(name1.compareTo(name2) ==0){
           System.out.println("strings are equal");

        }else{
            System.out.println("strings are not equal");
        }

    }
}
