import java.util.*;

public class arrays {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    int[] marks = new int[size];

    for (int i = 0; i < size; i++) {
      marks[i] = sc.nextInt();
    }

    System.out.println("enter the n. you want to search ");
    int x = sc.nextInt();
    // @2 method int marks[] = {12, 3, 4 ,4, 4, 3, 2, 2, 55,7};
    // @1 marks[0]=12;
    // marks[2]=13;
    // marks[3]=14;
    // marks[4]=24;
    // marks[5]=25;
    // marks[6]=26;
    // marks[7]=27;
    // marks[8]=28;
    // marks[9]=29;
    for (int i = 0; i < size; i++) {
      if (marks[i] == x)
        System.out.println("x is found:" + i);

    }

  }
}
