

//User function Template for Java
import java.util.*;


class Node{
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=right=null;
    }
}

class BinaryTree
{
    //Function to return a list containing the preorder traversal of the tree.
    static ArrayList<Integer> preorder(Node root)
    {
        // Code here
        ArrayList<Integer> res = new ArrayList<>();
        preorderTraversal(root,res);
        return res;
    }
    
    public static void preorderTraversal(Node root, ArrayList<Integer> res){
        if(root==null){
            return;
        }
        // System.out.println(root.data);
        res.add(root.data);
        preorderTraversal(root.left,res);
        preorderTraversal(root.right,res);
    }

}
