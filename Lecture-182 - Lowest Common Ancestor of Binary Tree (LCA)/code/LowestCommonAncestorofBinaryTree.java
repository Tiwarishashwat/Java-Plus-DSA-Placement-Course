
//   Definition for a binary tree node.
   class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
 
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null || root==p || root == q){
            return root;
        }
        TreeNode leftChild = lowestCommonAncestor(root.left,p,q);
        TreeNode rightChild = lowestCommonAncestor(root.right,p,q);
        if(leftChild==null){
            return rightChild;
        }else if(rightChild==null){
            return leftChild;
        }else{
            return root;
        }
    }
}



