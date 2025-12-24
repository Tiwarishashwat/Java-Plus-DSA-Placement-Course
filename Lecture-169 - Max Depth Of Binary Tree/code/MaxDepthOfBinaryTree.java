import java.util.*;
//   Definition for a binary tree node.
  class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
 
class Solution {

    public int maxDepth1(TreeNode root) {
        if(root==null){
            return 0;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int level=0;
        while(!queue.isEmpty()){
            int size = queue.size();
            // level wise traversal
            while(size>0){
                TreeNode node = queue.poll();
                size--;
                if(node.left!=null){
                    queue.offer(node.left);
                }
                if(node.right!=null){
                    queue.offer(node.right);
                }

            }
            if(!queue.isEmpty()){
                level++;
            }
        }
        return (level+1);
    }

    public int maxDepth(TreeNode root) {
       if(root==null){
           return 0;
       }
       // left height
       int lh = maxDepth(root.left);
        // right height
       int rh = maxDepth(root.right);
       return (1 + Math.max(lh,rh));
    }
}





