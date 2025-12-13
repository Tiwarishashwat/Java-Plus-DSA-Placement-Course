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

class BSTIterator {
    Stack<TreeNode> stack;
    public BSTIterator(TreeNode root) {
        stack = new Stack<>();
        //insert left boundary
        TreeNode node = root;
        while(node!=null){
            stack.push(node);
            node = node.left;
        }
    }
    
    public int next() {
        TreeNode node = stack.pop();
        int val = node.val;
        node = node.right;
        while(node!=null){
            stack.push(node);
            node = node.left;
        }
        return val;
    }
    
    public boolean hasNext() {
        return !stack.isEmpty();
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */