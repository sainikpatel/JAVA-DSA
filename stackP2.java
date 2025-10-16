import java.util.*;
public class stackP2 {
    public static void pushToBottom(Stack<Integer> s,int n){
        if (s.isEmpty()){
            s.push(n);
            return;
        }
        int temp =s.pop();
        pushToBottom(s,n);
        s.push(temp);
    }
    public static void reverse(Stack<Integer> s ){
        if(s.isEmpty()){
            return;
        }
        int top = s.pop();
        reverse(s);
        pushToBottom(s,top);
    }
    public static void main(String[] args){
        Stack<Integer> s =new Stack<>();
s.push(1);
s.push(2);
s.push(3);
s.push(4);
reverse(s);
while(!s.isEmpty()){
    System.out.println(s.pop());
}

    }
}
