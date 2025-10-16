import java.util.*;
public class hashmap {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
     map.put("India",120);
     map.put("USA",20);
     map.put("China",30);
        System.out.println(map);

        map.put("India",150);//updated.
        System.out.println(map);

        //search
      //  if(map.containsKey("India")){
        //    System.out.println("key exists");
        //}else{
          //  System.out.println("key not exists");
        //}
        //System.out.println(map.get("USA"));//exists
        //System.out.println(map.get("Japan"));//doesn't exists

        //for loop
        for(int val :map.values()){
            System.out.print(val+" ");
        }
        System.out.println();
        //another loop.
        for(Map.Entry<String,Integer> e:map.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }
    }
}
