import java.util.*;
public class sort{
    public static int selectionSort(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");

        }
        System.out.println();
        return 0;

    }
    public static void main(String args[]){
Scanner sc =new Scanner(System.in);
        System.out.println("Enter size of array:");
int n=sc.nextInt();

int arr[]=new int[n];
        System.out.println("Enter"+n+"elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }




        for(int i=0;i<arr.length-1;i++){
            int smallest =i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[smallest]>arr[j]){
                       smallest=j;
                }
            }
            int temp =arr[smallest];
            arr[smallest]=arr[i];
            arr[i]=temp;
        }
      selectionSort(arr);

    }
}