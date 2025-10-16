import java.util.*;

public class linkedlist {
public static void main(String[] args){
    LinkedList<String> list =new LinkedList<String>();
    list.add("name");
    list.add("sainik");
    list.addFirst("my");
    list.addLast("patel");
    System.out.println(list);

    list.add(3,"12");
    System.out.println(list);
    list.remove(3);
    System.out.println(list);

    list.addFirst("is");
    System.out.println(list);
    for(int i=0;i<list.size();i++){
        System.out.println(list.get(i));
    }
}
}
