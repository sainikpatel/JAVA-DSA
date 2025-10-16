public class TrisDs {
    public static class Node  {
        Node[] children;
        boolean eow;//end of word

        public Node(){
            children  = new Node[26];
            eow = false;
        }

    }
       static Node root = new Node();

    public static void insert(String words) {
          Node curr = root;   //temp variable to traverse
        for(int i=0;i<words.length();i++) {
            int idx = words.charAt(i) -'a';
          if(curr.children[idx] == null){ // add new node
              curr.children[idx] = new Node();
          }
          curr = curr.children[idx];
        }
        curr.eow = true;
    }
    public static boolean search(String key){
        Node curr = root;
        for(int i=0;i<key.length();i++) {
            int idx = key.charAt(i)- 'a';
            if(curr.children[idx] == null){
                return false;
            }
            curr = curr.children[idx];
        }
        return curr.eow;//true
    }
    public static boolean wordBreak(String key) {
        int len = key.length();
        if(len == 0) return true;

        for(int i=1;i<=len;i++) {
            if(search(key.substring(0,i)) && wordBreak(key.substring(i))) return true;
        }
        return false;
    }
    public static void main(String[] args) {
        String words[]= {"i","like","samsung","mobile","sam"};
        String key = "ilikesamsung";
        for(String word : words) {     // (i=0;i<words.len;i++)
          insert(word);
        }
        System.out.println(wordBreak(key));
        System.out.println(search(key));
    }
}
