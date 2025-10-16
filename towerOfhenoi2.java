public class towerOfhenoi2 {


        public static void towerOfHanoi(int n, String src, String helper, String dest) {
            if (n == 1) {
                // Base case: Only one disk to transfer directly
                System.out.println("transfer disk " + n + " from " + src + " to " + dest);
                return;
            }
            // Transfer top n-1 disks from src to helper using dest as helper
            towerOfHanoi(n - 1, src, dest, helper);

            // Transfer the nth disk from src to dest
            System.out.println("transfer disk " + n + " from " + src + " to " + dest);

            // Transfer n-1 disks from helper to dest using src as helper
            towerOfHanoi(n - 1, helper, src, dest);
        }

        public static void main(String args[]) {
            int n = 5; // Number of disks
            towerOfHanoi(n, "S", "H", "D"); // S=Source, H=Helper, D=Destination
        }
    }





