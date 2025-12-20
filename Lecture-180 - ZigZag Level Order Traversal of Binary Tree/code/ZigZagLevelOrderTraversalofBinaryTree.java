import java.util.*;;
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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new LinkedList<>();
        if(root==null){
            return res;
        }
        //LOT
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int level=0;
        while(!queue.isEmpty()){
            int size = queue.size();
            List<Integer> levelSubList = new LinkedList<>();
            while(size>0){
                //bfs
                TreeNode node = queue.poll();
                //odd
                if(level%2!=0){
                    levelSubList.addFirst(node.val);
                }else{ //even
                    levelSubList.add(node.val);
                }
                if(node.left!=null){
                    queue.offer(node.left);
                }
                if(node.right!=null){
                    queue.offer(node.right);
                }
                size--;
            }
            level++;
            res.add(levelSubList);
        }
        return res;
    }
}




