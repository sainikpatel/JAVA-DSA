import java.util.*;
public class namesarrays {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        String[] names= new String[n];

        for(int i=0; i<n ;i++){
            names[i]=sc.next();
        }
        for(int i=0;i<names.length;i++){
            System.out.println("name"+(i+1)+"is:"+names[i]);
        }

    }
}
