import java.util.*;

class hw {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        System.out.println("enter the size of list");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("enter the elements between 1 to 50");
        for (int i = 0; i < n; i++) {
            int value =sc.nextInt();
            if (value >= 1 && value <= 50) {
                list.add(value);
            }else {
                System.out.println("invalid input");
               i--;  //Retry input for same index.
            }
        }
        System.out.println("original list is  "+list);

        //removing elements using iterator
    list.removeIf(num -> num > 25);
    System.out.println("list is  "+list);

    }
}
