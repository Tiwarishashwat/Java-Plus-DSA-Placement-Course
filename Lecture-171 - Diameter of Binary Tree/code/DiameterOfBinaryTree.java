
//  Definition for a binary tree node.
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
    public int diameterOfBinaryTree(TreeNode root) {
        int maxi[] = new int[1]; //pass by reference
        findHeight(root,maxi);
        return maxi[0];
    }
    public int findHeight(TreeNode root, int maxi[]){
        if(root==null){
            return 0;
        }
        int leftHeight = findHeight(root.left,maxi);
        int rightHeight = findHeight(root.right,maxi);
        maxi[0] = Math.max(maxi[0],leftHeight+rightHeight);
        return (1+Math.max(leftHeight,rightHeight));
    }
}





