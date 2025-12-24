import java.util.*;

//   Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode node = root;
        while (node != null || !stack.isEmpty()) {
            // move to the left
            if (node != null) {
                stack.push(node);
                node = node.left;
            }
            // move to the right
            else if (stack.peek().right != null) {
                node = stack.peek().right;
            } else {
                TreeNode temp = stack.pop();
                res.add(temp.val);
                while (!stack.isEmpty() && temp == stack.peek().right) {
                    temp = stack.pop();
                    res.add(temp.val);
                }
            }
        }
        return res;
    }
}
