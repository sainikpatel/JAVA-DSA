public class towerOfhenoi {
    public static void towerOfHenoi(int n, String source, String helper, String destination) {
        if (n == 1) {
            System.out.println("transfer disk " +n+ " from "+source+" to "+destination);
            return;
        }
        towerOfHenoi(n-1, source, destination, helper);
        System.out.println("transfer disk "+n+"from"+source+"to"+destination);
        towerOfHenoi(n-1, helper, source, destination);
    }
    public static void main(String args[]){
        int n=3;
        towerOfHenoi(n,"S","H","D");
    }
}
