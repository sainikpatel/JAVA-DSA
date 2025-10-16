import java.util.*;
public class stackP1 {
    public static void pushAtBottom(Stack<Integer> stack,int n)
    {
        if(stack.isEmpty()){
            stack.push(n);
            return;
        }
        int temp = stack.pop();
        pushAtBottom(stack,n);
        stack.push(temp);
    }
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(3);
        stack.push(2);
        stack.push(1);
        pushAtBottom(stack,5);

        while(!stack.isEmpty()){
            System.out.print(" "+stack.pop());

        }
    }
}
