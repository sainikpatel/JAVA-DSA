class deleteNode {
    Node head;

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;

        }
    }

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;

    }

    public void printList() {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("null");

    }

    // removeNth node from last
    public Node removeNode(Node head, int n) {

        if (head.next == null) {
            return null;
        }
        // size
        int size = 0;
        Node currNode = head;
        while (currNode != null) {
            currNode = currNode.next;
            size++;
        }
        if (n == size) {
            return head.next;
        }
        int idxToSearch = size - n;
        Node prevNode = head;
        int i = 1;
        while (i < idxToSearch) {
            prevNode = prevNode.next;
            i++;
        }
        prevNode.next = prevNode.next.next;
        return head;
    }

    public static void main(String[] args) {
        deleteNode list = new deleteNode();
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        list.addFirst(4);
        list.addFirst(5);
        list.printList();
        list.head = list.removeNode(list.head, 3);
        list.printList();
    }
}
