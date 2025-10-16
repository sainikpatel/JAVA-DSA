import java.util.ArrayList;

public class BST {
    static class Node{
        int data;
        Node left;
        Node right;
         Node(int data){
            this .data=data;
        }
    }
    // inorder traversal in BST result in a sorted output
    public static void inorder(Node root){
        if(root == null) return;
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static Node insert(Node root,int data){
        if(root== null){
            root = new Node(data);
            return root;
        }
        if(root.data>data){
            //left subtree
            root.left=insert(root.left,data);
        }
        else {
            root.right = insert(root.right, data);
        }
        return root;
    }
    public static boolean search(Node root ,int value){
        if(root == null) return false;
        if(root.data==  value) return true;
        if(root.data>value)return search(root.left,value);
       else return search(root.right,value);

    }
    public static Node delete(Node root,int value){
        if(root.data>value){
            root.left = delete(root.left,value);
        }
        else if(root.data<value){
            root.right = delete(root.right,value);
        }
        else{//root.data==value
            if(root.left==null&&root.right==null){
                return null;
            }
            //case 2
            if(root.left==null){
                return root.right;
            }
            else if(root.right==null){
                return root.left;
            }
            //case 3
            Node IS =inOrderSuccessor(root.right);
            root.data = IS.data;
            root.right =delete(root.right,IS.data);
        }
        return root;
    }
    public static Node inOrderSuccessor(Node root){
       while(root.left!=null){
           root=root.left;
       }
       return root;
    }
    public static void printInRange(Node root ,int x,int y){
        if(root == null) return;
        else if(root.data>=x &&  root.data<=y){
            printInRange(root.left,x,y);
            System.out.print(root.data+" ");
            printInRange(root.right,x,y);
        }
        else if(root.data>=y){
            printInRange(root.left,x,y);
        }
        else{
            printInRange(root.right,x,y);
        }
    }
    public static void printPath(ArrayList<Integer> path){
        for(int i=0;i<path.size();i++){
            System.out.print(path.get(i)+" ->");
        }
        System.out.println();
    }
    public static void printRoot2LeefPaths(Node root, ArrayList<Integer> path){
        if(root == null) return;
        path.add(root.data);
        //lesf
        if(root.left==null&&root.right==null){
            printPath(path);
        }else{
            printRoot2LeefPaths(root.left,path);
            printRoot2LeefPaths(root.right,path);
        }
        path.remove(path.size()-1);
    }
    public static void main(String[] args){
        int values[]={5,1,3,4,2,7,11,13,15};
      Node root = null;
     for(int i=0;i<values.length;i++){
         root = insert(root,values[i]);
     }

        printRoot2LeefPaths(root,new ArrayList<>());
    }
}
