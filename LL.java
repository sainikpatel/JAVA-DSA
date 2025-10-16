
class LL {
    Node head;
    private int size;
    LL(){
        this.size=0;
    }

class Node {
    String data;
    Node next;
    Node(String data){
        this.data =data;
        this.next = null;
size++;
    }
}
public void addFirst(String data ){
    Node newNode = new Node(data);
    if(head== null){
        head = newNode;
        return;
    }
    newNode.next=head;
    head=newNode;

}
public void addLast(String data) {
    Node newNode =new Node(data);
    if(head == null) {
        head = newNode;
        return;
    }
    Node currentNode =head;
    while(currentNode.next!=null){
          currentNode=currentNode.next;

    }
    currentNode.next=newNode;
}
//print list
    public void printList(){
    if(head==null){
        System.out.println("list is empty");
        return;
    }
    Node currentNode = head;
    while(currentNode!=null) {
        System.out.print(currentNode.data + " -> ");
        currentNode=currentNode.next;
    }
        System.out.println("null");
    }
    //delete first
    public void deleteFirst(){
    if(head== null){
        System.out.println("list is empty");
        return;
    }
    size--;
    head=head.next;

    }
    //delete last
    public void deleteLast(){
    if(head== null){
        System.out.println("list is empty");
        return;
    }
    if(head.next==null){
        head=null;
    }
    size--;
    Node secondLast =head;
    Node lastNode=head.next;
    while(lastNode.next!=null) {
        lastNode=lastNode.next;
        secondLast=secondLast.next;
    }
    secondLast.next=null;
    }
    public int printSize(){
        return size;
    }
    public void printrev(){
        if(head==null || head.next==null){
            return;
        }
        Node prevNode = null;
        Node currNode = head;
        while(currNode != null){
            Node nextNode = currNode.next;
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = nextNode;
        }
        head=prevNode;
    }


public static void main(String[] args){
    LL list = new LL();
list.addFirst("sai");
list.addFirst("nik");
list.addLast("patel");
list.addFirst("He is");
list.printList();
list.printrev();
list.printList();
}
}
