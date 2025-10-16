public class BST1 {
    static class Node {
        int data;
        Node left;
        Node right;

            Node(int data) {
            this.data = data;
        }
    }
        public static void inOrder(Node root){
            if(root== null) return;
            inOrder(root.left);
            System.out.print(root.data+" ");
            inOrder(root.right);
        }
        public  static Node insert(Node root,int data){
        if(root==null){
            root = new Node(data);
            return root;
        }
        else if(root.data>data){
            root.left = insert(root.left,data);
        }else if(root.data<data){
            root.right = insert(root.right,data);
        }
        return root;
        }
        public static Node deleteNode(Node root,int val) {
            if (root.data > val) {
                root.left = deleteNode(root.left, val);
            } else if (root.data < val) {
                root.right = deleteNode(root.right, val);
            } else{
                    if (root.left == null && root.right == null) {
                        return null;
                    }

                if (root.right == null) {
                    return root.left;
                } else if (root.left == null) {
                    return root.right;
                }
                Node IS = inorderSuccessor(root.right);
                root.data = IS.data;
                root.right = deleteNode(root.right, IS.data);
            }
            return root;
        }
        public static Node inorderSuccessor(Node root) {
        while(root.left!=null){
            root=root.left;
        }
        return root;
        }
      public static void main(String[] args){
         int nodes[] = {1,2,3,5,6,9,7};
          Node root = null;
          for(int i=0;i<nodes.length;i++){
              root = insert(root,nodes[i]);
          }
          inOrder(root);
          deleteNode(root,5);
          System.out.println();
          inOrder(root);
        }
}
