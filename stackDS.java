import java.util.*;
public class stackDS {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
       s.push(100);
// using collection framework
        while(!s.isEmpty()){
            System.out.print(" "+s.peek());
            s.pop();
        }
    }
}
