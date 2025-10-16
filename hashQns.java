// Given an integer array of size n,find all the numbers that appear more than [n/3]times.
//Ex.arr[]={1,2,3,4,5,2,1,1,1]
//Ans = 1.
import java.util.HashMap;
public class hashQns {
    public static void majorityElement(int nums[]){
    HashMap<Integer,Integer> map =  new HashMap<>();
    int n = nums.length;
    for(int i=0;i<n;i++){
        if(map.containsKey(nums[i])){//  checking the frequency
            map.put(nums[i],map.get(nums[i])+1);//if found more than once increase the frequency
        }else{
            map.put(nums[i],1);//assign new num and frequency
        }
    }
    for(int key : map.keySet()){
     if(map.get(key)>n/3){
         System.out.println(key);
     }
    }
    }
    public static void main(String[] args){
       int nums[] = {1,3,2,5,1,3,1,5,1,5,5};
       majorityElement(nums);
    }
}
