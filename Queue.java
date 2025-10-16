//queue using array
public class Queue {

static class Queuey{
    static int arr[];
    static int size;
static int rear = -1;
    Queuey(int n) {
        arr = new int[n];
                this.size =n;
    }
    public static boolean isEmpty(){
        return rear==-1;
    }
    public void add(int data){
        if(rear == size-1) {
            System.out.println("queue is full");
return;
        }
        rear ++;
        arr[rear] = data;
    }
    public static int remove(int data) {
        if(isEmpty()){
            System.out.println("queue is empty");
            return -1;
        }
        int front= arr[0];
        for(int i=0;i<rear;i++) {
            arr[i]=arr[i+1];
        }
        rear--;
        return front;
    }
    //peek
    public static int peek() {
        if(isEmpty()){
            System.out.println("queue is empty");
            return -1;
        }
        return arr[0];
    }
}
public static void main(String[] args){
    Queuey q = new Queuey(5);
    q.add(1);
    q.add(2);
    q.add(3);
    q.add(4);
    while(!q.isEmpty()){
        System.out.println(q.peek());
        q.remove(0);
    }
}
}
