import java.util.*;
public class hashQns2 {
    public static int union(int arr[],int arr1[]){
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }
        for(int j=0;j<arr1.length;j++){
            set.add(arr1[j]);
        }
        System.out.println(set);
        return set.size();
    }
    public static int intersection(int arr[] ,int arr1[]){
        HashSet<Integer> set = new HashSet<>();
        int count =0;
        for(int i=0;i<arr.length;i++){  // I'll get unique elements
            set.add(arr[i]);
        }
        for(int j=0; j<arr1.length;j++){
            set.contains(arr1[j]);
            count ++;
            set.remove(arr1[j]);
        }
        return set.size();
    }
public static void main(String[] args){

    int arr[] = {1,2,3,4,6,8,9};
    int arr1[] = {2,5,9};
    System.out.println(intersection(arr,arr1));


}
}
