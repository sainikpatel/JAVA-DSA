class LL1 {
    Node head;

   static class Node {
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    public void printList() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
         Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("null");
    }
    public Node recursiveMethod(Node head){          //reversing a linked list.
        if(head == null || head.next == null){
            return head;
        }
        Node newHead = recursiveMethod(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }
    public static void main(String[] args){
        LL1 list = new LL1();

        list.addFirst(5);
        list.addFirst(4);
        list.addFirst(3);
        list.addFirst(2);
        list.addFirst(1);
        list.printList();
        list.head = list.recursiveMethod(list.head);
        list.printList();

    }
}
