import java.util.HashSet;
import java.util.Iterator;
public class hashset {
    public static void main(String[] args){
        HashSet<Integer> set = new HashSet<>();
        //Add
        set.add(1);
        set.add(3);
        set.add(5);
        set.add(2);
        set.add(5);
        //System.out.println(set);
       // set.remove(2);
        System.out.println(set);
        //search
       if(set.contains(5)){
           System.out.println("Set contains 5");
        }
       if(!set.contains(9)){
           System.out.println("Set does not contains 9! ");
       }
       //set size
        System.out.println("Size of set is "+set.size());
        Iterator<Integer> it = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
