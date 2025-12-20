
import java.util.*;
//User function Template for Java


class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}

class CustomNode{
        Node node;
        int col;
        CustomNode(Node node, int col){
            this.node = node;
            this.col = col;
        }
    }
class Solution
{
     
    //Function to return a list of nodes visible from the top view 
    //from left to right in Binary Tree.
    static ArrayList<Integer> topView(Node root)
    {
        ArrayList<Integer> res = new ArrayList<>();
        if(root==null){
            return res;
        }
        // add your code
        Queue<CustomNode> queue = new LinkedList<>();
        queue.offer(new CustomNode(root,0));
        TreeMap<Integer,Integer> map = new TreeMap<>();
        while(!queue.isEmpty()){
            CustomNode customNode = queue.poll();
            Node node = customNode.node;
            int col = customNode.col;
            if(!map.containsKey(col)){
                map.put(col,node.data);
            }
            if(node.left!=null){
                queue.offer(new CustomNode(node.left,col-1));
            }
            if(node.right!=null){
                 queue.offer(new CustomNode(node.right,col+1));
            }
            
            
        }
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            res.add(entry.getValue());
        }
        return res;
    }
}








