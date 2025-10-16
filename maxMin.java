import java.util.*;
public class maxMin {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements of thr array");
        int n =sc.nextInt();
        System.out.println("Enter the elements of thr array");
        int[] numbers=new int[n];
//input of numbers
        for(int i=0;i<n;i++){
            numbers[i]=sc.nextInt();
        }
        int max= numbers[0];
        int min= numbers[0];

        for(int i=0;i<n;i++){
            if(numbers[i]>max) {
                max = numbers[i];
            }
                 if(numbers[i]<min){
                     min = numbers[i];
                 }



        }
       System.out.println("maximum number is: "+max);
        System.out.println("minimum number is; "+min);
    }
}
