
//   Definition for a binary tree node.
   class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
 

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        //base
        if(root==null || root==p || root==q){
            return root;
        }
        //check if both nodes are on the left
        if(p.val<root.val && q.val<root.val){
            return lowestCommonAncestor(root.left,p,q);
        }
         if(p.val>root.val && q.val>root.val){
            return lowestCommonAncestor(root.right,p,q);
        }
        //current node is the split point.
        return root;
    }
}



