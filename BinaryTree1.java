import java.util.*;

public class BinaryTree1 {

    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static class BinaryTree{
        static int idx = -1;
        public static Node buildTree(int nodes[]) {
            idx++;
           if(idx>=nodes.length ||nodes[idx] == -1){
               return null;
           }
           Node newNode = new Node(nodes[idx]);
           newNode.left = buildTree(nodes);
           newNode.right = buildTree(nodes);
           return newNode;
        }
    }
    //preorder traversal
    // order of  printing root -> left ->right
    public static void preOrder(Node root) {
        if(root == null) {
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    //inorder traversal
    //left -> root -> right
    public static void inOrder(Node root) {
        if(root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }
       //post Order traversal
       // lift ->right -> root
    public static void postOrder(Node root) {
        if(root  == null) {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.data+" ");
    }

     // level order traversal
    //breadth wise traversal
    public static void levelOrder(Node root) {
        if(root == null) return;

        LinkedList<Object> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            Node currNode = (Node) q.remove();
            if(currNode == null) {
                System.out.println();
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
            }else{
                System.out.print(currNode.data+" ");
                if(currNode.left !=null){
                    q.add(currNode.left);
                }
                if(currNode.right !=null){
                    q.add(currNode.right);
                }
            }
        }
    }
       public static int sumOfLevel(Node root , int n){

        if(root == null) return 0;
        LinkedList<Object> q = new LinkedList<>();
        q.add(root);
        int level = 0;
        while(!q.isEmpty()) {
            int size = q.size();
            int sum = 0;
            for(int i=0;i<size;i++){
                Node currNode = (Node) q.remove();
                if(level == n) sum += currNode.data;
                if(currNode.left != null)q.add(currNode.left);
                if(currNode.right != null)q.add(currNode.right);
            }
              if(level == n)return sum;
              level++;
        }
        return 0;
       }
    public static int countNodes(Node root){
        if(root == null) return 0;
        int leftnodes = countNodes(root.left);
        int rightnodes = countNodes(root.right);
        return leftnodes + rightnodes + 1;
    }
    //sum of nodes
    public static int SumOfNodes(Node root) {
        if(root == null) return 0;

        int leftsum = SumOfNodes(root.left);
        int rightsum = SumOfNodes(root.right);
        return leftsum + rightsum + root.data;
    }
    //Height of tree
    public static int HeightOfTree(Node root) {
        if(root == null) return 0;
        int leftheight = HeightOfTree(root.left);
        int rightheight = HeightOfTree(root.right);

        int myHeight = Math.max(leftheight, rightheight) +1;

        return myHeight;
    }
    //Diameter of tree
    public static int Diameter(Node root) {
        if (root == null) return 0;

        int diam1 = Diameter(root.left);
        int diam2 = Diameter(root.right);
        int diam3 = HeightOfTree(root.left) + HeightOfTree(root.right) +1;
        return Math.max(diam3,Math.max(diam1,diam2));

    }
    // Approach 2
       static class TreeInfo{
        int ht;
        int dia;
        TreeInfo(int ht , int dia) {
            this.ht=ht;
            this.dia = dia;
        }
    }
    public static TreeInfo diameter(Node root) {
        if(root == null) return new TreeInfo(0,0);

        TreeInfo left = diameter(root.left);
        TreeInfo right = diameter(root.right);
        int myHeight = Math.max(left.ht,right.ht) +1;
        int dia1 = left.dia;
        int dia2 = right.dia;
        int dia3 = left.ht + right.ht +1;

        int mydiameter = Math.max(dia3,Math.max(dia1,dia2));

        TreeInfo myinfo = new TreeInfo(myHeight,mydiameter);
        return myinfo;
    }
    //Determining the subtree
        public static boolean isIdentical(Node root,Node subtree) {

        if(root == null && subtree == null) return true;
        if(root == null || subtree == null) return false;
        if(root.data != subtree.data) return false;

        return isIdentical(root.left , subtree.left) && isIdentical(root.right , subtree.right);
        }
        public static boolean isSubtree(Node root , Node subtree) {

        if(subtree == null) return false;
        if(root == null) return false;
        if(isIdentical(root ,subtree)) return true;
        return isSubtree(root.left , subtree) || isSubtree(root.right , subtree);
        }
      public static void main(String[]  args) {
          int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
          int subnode[] = {6};
          BinaryTree tree = new BinaryTree();
          BinaryTree.idx =-1;
          Node root = tree.buildTree(nodes);
          BinaryTree.idx =-1;
          Node subNode = tree.buildTree(subnode);
          levelOrder(root);
          if(isSubtree(root ,subNode)){
              System.out.println("Yes,it subtree of node");
          }else{
              System.out.println("No,it not subtree of node");
          }
          int level =1;
          System.out.println("The sum of level "+level+ " is "+sumOfLevel(root,level));
      }

}


// time complexity to search a node is (On)