public class tris4 {

    public static class Node {
        Node[] children;
        boolean eow; // end of word

        public Node() {
            children = new Node[26];
            eow = false;
        }
    }

    static Node root = new Node();
    public static String ans = "";

    public static void insert(String word) {
        Node curr = root; // Temporary variable to traverse
        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';
            if (curr.children[idx] == null) { // Add new node
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx];
        }
        curr.eow = true;
    }

    public static void longestWord(Node root, StringBuilder temp) {
        if (root == null) {
            return;
        }
        for (int i = 0; i < 26; i++) {
            if (root.children[i] != null && root.children[i].eow) {
                temp.append((char) (i + 'a'));
                if (temp.length() > ans.length()) {
                    ans = temp.toString();
                }
                longestWord(root.children[i], temp);
                temp.deleteCharAt(temp.length() - 1); // Backtrack
            }
        }
    }

    public static void main(String[] args) {
        String[] words = {"a", "app", "banana", "apply", "apple", "appl"};

        for (String word : words) {
            insert(word);
        }

        longestWord(root, new StringBuilder());
        System.out.println("Longest word with the highest prefixes: " + ans);
    }
}

