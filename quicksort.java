import java.util.*;
public class quicksort {
    public static int partation(int arr[],int low,int high){
        int pivot = arr[high];   //let we consider the last element as pivot
        int i=low-1;

        for(int j =low;j<high;j++){
            if(arr[j]<pivot){
                i++;
                //swap
                int temp =arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        i++; // now 'i' is the last element (pivot)
        //so we should swap it
        int temp =arr[i];
        arr[i]=arr[high];
        arr[high]=temp;

        return i;

    }
    public static void quickSort(int arr[],int low,int high){
        if(low<high){
            int piidx=partation(arr,low,high);

            quickSort(arr,low,piidx-1);
            quickSort(arr,piidx+1,high);
        }
    }
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);

        System.out.println("Emter size of array");
        int n=sc.nextInt();
        int[] arr=new int[n];

        System.out.println("Enter array elements ");

        for(int i=0;i<n;i++){
             arr[i]=sc.nextInt();
        }


        quickSort(arr,0,n-1);

        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
        System.out.println();
    }
}
