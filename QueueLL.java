// Queue using linked list
import java.util.*;
public class QueueLL {
 static class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
static class Queue {
    static Node head = null;
    static Node tail = null;

    public static boolean isEmpty() {
        return head== null && tail == null;
    }
    public static void add(int data) {
        Node newNode = new Node(data);
        if(isEmpty()) {
           head = tail = newNode;
        }
        else {
            tail.next = newNode;
            tail = newNode;
        }
    }
    public static int remove() {
        if(isEmpty()) {
            System.out.println("list is empty");
            return -1;
        }
        int front = head.data;
        head = head.next;
        return front;
    }
    public static int peek() {
        if(isEmpty()) {
            System.out.println("List is empty");
            return -1;
        }
        return head.data;
    }
}
         public static void main(String[] args) {
              Queue q  = new Queue();
              q.add(1);
              q.add(2);
              q.add(3);
              q.add(4);
              q.add(5);
              while(!q.isEmpty()) {
                  System.out.println(q.peek());
                  q.remove();
              }

         }
}

