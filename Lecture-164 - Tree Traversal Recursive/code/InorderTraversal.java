

// User function Template for Java
import java.util.*;
//  A Binary Tree node

class Node {
    int data;
    Node left, right;
   Node(int item)    {
        data = item;
        left = right = null;
    }
} 
class Solution {
    // Function to return a list containing the inorder traversal of the tree.
    ArrayList<Integer> inOrder(Node root) {
        // Code
        ArrayList<Integer> res = new ArrayList<>();
        inorderTraversal(root,res);
        return res;
    }
    
  
    public void inorderTraversal(Node root, ArrayList<Integer> res){
        if(root==null){
            return;
        }
        // System.out.println(root.data);
        inorderTraversal(root.left,res);
        res.add(root.data);
        inorderTraversal(root.right,res);
    }
}