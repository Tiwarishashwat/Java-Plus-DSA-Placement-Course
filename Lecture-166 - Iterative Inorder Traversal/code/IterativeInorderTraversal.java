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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode node = root;
        while(node!=null || !stack.isEmpty()){
            //move to the left
            while(node!=null){
                stack.push(node);
                node = node.left;
            }
            // print the root
            node = stack.pop();
            res.add(node.val);
            // move to the right subtree
            node = node.right;
        }
        return res;
    }
}






