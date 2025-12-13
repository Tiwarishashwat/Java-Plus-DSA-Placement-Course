import java.util.*;
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};


class Solution {
    public int maxDepth(Node root) {
        if(root==null) return 0;
        int maxDepth=0;
        for(Node node : root.children){
            if(node!=null){
                maxDepth = Math.max(maxDepth,maxDepth(node));
            }
        }
        return (1+maxDepth);
    }
}









