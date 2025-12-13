
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
    int ans;
    public int maxSumBST(TreeNode root) {
        ans = 0;
        dfs(root);
        return ans;
    }
    // arr -> min,max,sum
    public int[] dfs(TreeNode root){
        //base case
        if(root==null){
            return new int[]{Integer.MAX_VALUE,Integer.MIN_VALUE,0};
        }
        int leftSubtree[] = dfs(root.left);
        int rightSubtree[] = dfs(root.right);
        //check if current subtree is bst
        if(root.val>leftSubtree[1] && root.val<rightSubtree[0]){
            int curSum = leftSubtree[2] + rightSubtree[2] + root.val;
            ans = Math.max(ans,curSum);
            int minVal = Math.min(root.val,leftSubtree[0]);
            int maxVal = Math.max(root.val,rightSubtree[1]);
            return new int[]{minVal,maxVal,curSum};
        }
        int maxSum = Math.max(leftSubtree[2],rightSubtree[2]);
        return new int[]{Integer.MIN_VALUE,Integer.MAX_VALUE,maxSum};
    }
}




