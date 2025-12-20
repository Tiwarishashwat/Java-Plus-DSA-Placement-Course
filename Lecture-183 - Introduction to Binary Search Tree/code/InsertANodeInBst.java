
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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root==null){
            root = new TreeNode(val);
            return root;
        }
        //find the pos & insert
        TreeNode temp = root;
        while(temp!=null){
            if(val < temp.val){
                //left subtree
                if(temp.left==null){
                    temp.left = new TreeNode(val);
                    break;
                }else{
                    temp = temp.left;
                }
            }else{
                 //right subtree
                if(temp.right==null){
                    temp.right = new TreeNode(val);
                    break;
                }else{
                    temp = temp.right;
                }
            }
        }
        return root;
    }
}



class Solution1 {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root == null){
            root = new TreeNode(val);
            return root;
        }
        if(val<root.val){
            root.left = insertIntoBST(root.left,val);
        }else{
            root.right = insertIntoBST(root.right,val);
        }
        return root;
    }
}




