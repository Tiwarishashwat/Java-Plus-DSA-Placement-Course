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
    public boolean findTarget(TreeNode root, int k) {
        ArrayList<Integer> inorder = new ArrayList<>();
        inorderTraversal(root,inorder);
        int start=0;
        int end=inorder.size()-1;
        while(start<end){
            int sum = inorder.get(start) + inorder.get(end);
            if(sum==k){
                return true;
            }
            if(sum<k){
                start++;
            }else{
                end--;
            }
        }
        return false;
    }

    public void inorderTraversal(TreeNode root, ArrayList<Integer> inorder){
        if(root==null){
            return;
        }
        inorderTraversal(root.left,inorder);//left
        inorder.add(root.val);
        inorderTraversal(root.right,inorder);//right
    }
}






