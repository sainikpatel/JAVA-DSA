public class tries2 {

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

    public static boolean search(String key){
        Node curr = root;
        for(int i=0;i<key.length();i++) {
            int idx = key.charAt(i)-'a';
            if(curr.children[idx]==null){
                return false;
            }
            curr = curr.children[idx];
        }
        return curr.eow;
    }

    public static boolean startsWith(String prefix) {
        Node curr = root;
        for(int i=0;i<prefix.length();i++){
            int idx = prefix.charAt(i)-'a';
           if(curr.children[idx] == null){
               return false;
           }
           curr = curr.children[idx];
        }
        return true;
    }


    public static void main(String[] args) {
        String[] words = {"app","apple","man","mango","women"};
        String prefix = "appl";
        for(int i=0 ; i<words.length;i++){
            insert(words[i]);
        }
        System.out.println(startsWith(prefix));
    }

}
