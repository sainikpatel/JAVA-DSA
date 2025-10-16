public class LLP {
    Node head;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node currentNode= head;
        while(currentNode.next != null){
            currentNode=currentNode.next;
        }
        currentNode.next=newNode;
    }
    public void printList(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        Node currentNode=head;
        while(currentNode != null){
            System.out.print(currentNode.data + " -> ");
            currentNode=currentNode.next;
        }
        System.out.println("null");
    }
    //swapping of adjacent elements of a linked list.
    public Node swapList(Node head){
        if(head == null || head.next==null){
            System.out.println("List is empty");
            return head;
        }
        Node dummy = new Node(0);
        dummy.next = head;
        Node prev = dummy;
        while(prev.next !=null && prev.next.next != null){
            Node first = prev.next;
            Node second = first.next;

            //swapping
            first.next=second.next;
            second.next=first;
            prev.next=second;

            prev=first;
        }   
        return dummy.next;
    }
    public static void main(String[] args){
        LLP list = new LLP();
        list.addLast(10);
        list.addLast(9);
        list.addLast(8);
        list.addLast(7);
        list.printList();
        list.head = list.swapList(list.head);
        list.printList();
    }
}
