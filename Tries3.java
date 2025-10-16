public class Tries3 {
    public static class Node {
        Node[] children;
        boolean eow;
        public Node() {
            children = new Node[26];
            eow = false;
        }
    }

    public static Node root = new Node();
    public static void insert(String words) {
        Node curr =root;
        for(int i=0;i<words.length();i++) {
            int idx = words.charAt(i)-'a';

            if(curr.children[idx] == null) {
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx];
        }
        curr.eow = true;
    }
    public static int countNode(Node root) { //  count of unique substrings of a string
        if(root == null) return 0;
        int count =0;
        for(int i=0 ; i<26; i++){
            if(root.children[i]!= null){
                count+=countNode(root.children[i]);
            }
        }
        return count+1;
    }
    public static void main(String[] args) {
        String words ="apple";
        for(int i=0;i<words.length();i++) {
            String suffix = words.substring(i);
            insert(suffix);
        }
        System.out.println(countNode(root));
    }
}
