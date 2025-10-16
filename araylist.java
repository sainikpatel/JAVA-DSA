import java.util.*;
import java.util.Collections;

public class araylist {
    public static void main(String args[]) {

        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<String> list2 = new ArrayList<String>();
        // Adding elements into arraylist
        list.add(5);
        list.add(2);
        list.add(3);

        // extracting or getting
        int ele = list.get(0);

        // placing an element in between the list of elements

        list.add(0, 0);

        System.out.println(list);

        // set element
        list.set(0, 1);
        System.out.println(list);

        // delete element
        list.remove(1);
        System.out.println(list);

        // to know size

        int size = list.size();
        System.out.println(size);

        // loop
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
        }
        // sorting
        Collections.sort(list);
        System.out.print(list);
    }
}
