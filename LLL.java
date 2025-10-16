// list palindrome check
class LLL {
    Node head;
    static class  Node {
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next=null;
        }
    }
    public void addFirst(int data){
        Node newNode = new Node( data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next= head;
        head=newNode;
    }
    public void printList(){
        if(head == null){
            System.out.println("list is empty");
            return;
        }
       Node currNode=head;
        while(currNode != null){
            System.out.print(currNode.data +" -> ");
            currNode = currNode.next;
        }
        System.out.println("null");

    }
    public Node getMiddle(Node head){
        Node fast = head;
        Node slow = head;
        while(fast != null && fast.next!= null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
    public Node reverse(Node head){
        Node prev = null;
        Node curr = head;

        while(curr != null){
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    public boolean isPalindrome(Node head) {
        if(head == null || head.next == null ) {
            return true;
        }
            Node firstHalfEnd = getMiddle(head);
            Node secondHalfStart = reverse(firstHalfEnd.next);
            Node firstHalfStart = head;

            while(secondHalfStart !=null) {
                if(secondHalfStart.data != firstHalfStart.data) {
                    return false;
                }
                firstHalfStart = firstHalfStart.next;
                secondHalfStart = secondHalfStart.next;
            }
            return true;
    }


      public static void main(String[] args) {
        LLL list = new LLL();
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(2);
        list.addFirst(1);
        list.printList();

        System.out.println(list.isPalindrome(list.head));
        System.out.println(list.getMiddle(list.head).data);

    }
}
