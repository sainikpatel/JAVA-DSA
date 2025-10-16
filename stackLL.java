import java.util.*;
public class stackLL {
    private Node top;
    Node head;

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;


    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        int poppedVal = top.data;
        top = top.next;
        return poppedVal;
    }

    public  int peek() {
        if (isEmpty()) {
            System.out.print("Stack is empty");
            return -1;
        }
        return top.data;
    }
    public void display(){
        if(isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        Node curr = top;
        while(curr != null) {
            System.out.print(" "+curr.data);
            curr = curr.next;
        }
    }


    public static void main(String[] args) {
    stackLL s = new stackLL();
    s.push(1);
    s.push(2);
    s.push(3);
    s.push(4);
    s.push(5);
    s.display();
    s.pop();
    s.display();
    s.peek();
    }
}