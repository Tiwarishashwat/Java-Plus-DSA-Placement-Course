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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        HashMap<Integer, Integer> indexMap = new HashMap<>();
        // hash the values with index
        for (int i = 0; i < inorder.length; i++) {
            indexMap.put(inorder[i], i);
        }
        int n = postorder.length - 1;
        int m = inorder.length - 1;
        TreeNode root = constructTree(postorder, inorder, indexMap, 0, n, 0, m);
        return root;
    }

    public TreeNode constructTree(int[] postorder, int[] inorder,
            HashMap<Integer, Integer> indexMap, int postIndStart, int postIndEnd,
            int inIndStart, int inIndEnd) {
        // handle the base case
        if (postIndStart > postIndEnd || inIndStart > inIndEnd) {
            return null;
        }
        int rootData = postorder[postIndEnd];
        int rootIndex = indexMap.get(rootData);
        TreeNode root = new TreeNode(rootData);
        int leftTreeSize = rootIndex - inIndStart;
        // int rightTreeSize = inIndEnd - rootIndex;
        root.left = constructTree(postorder, inorder, indexMap, postIndStart,
                postIndStart + leftTreeSize - 1, inIndStart, rootIndex - 1);
        root.right = constructTree(postorder, inorder, indexMap, postIndStart + leftTreeSize, postIndEnd - 1,
                rootIndex + 1, inIndEnd);
        return root;
    }
}