

//User function Template for Java


import java.util.*;
//User function Template for Java

//  A Binary Tree node
class Node {
    int data;
    Node left, right;
   Node(int item)    {
        data = item;
        left = right = null;
    }
} 

class Tree
{
    //Function to return a list containing the postorder traversal of the tree.
    ArrayList<Integer> postOrder(Node root)
    {
       // Your code goes here
        ArrayList<Integer> res = new ArrayList<>();
        postorderTraversal(root,res);
        return res;
    }

    public void postorderTraversal(Node root, ArrayList<Integer> res){
        if(root==null){
            return;
        }
        postorderTraversal(root.left,res);
        postorderTraversal(root.right,res);
        res.add(root.data);
    }
}