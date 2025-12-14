class Node {
    Node left;
    Node right;
}

// User function Template for Java

class Solution {
    
    public static int findLeftHeight(Node root){
        int count =1;
        while(root.left!=null){
            count++;
            root = root.left;
        }
        return count;
    }
    
    public static int findRightHeight(Node root){
        int count =1;
        while(root.right!=null){
            count++;
            root = root.right;
        }
        return count;
    }

    public static int countNodes(Node root) {
        // Code here
        // base case
        if(root==null){
            return 0;
        }
        //check if all levels are completely filled
        int leftHeight = findLeftHeight(root);
        int rightHeight = findRightHeight(root);
        if(leftHeight == rightHeight){
            return ((int)Math.pow(2,leftHeight)-1);
        }
        
        return 1 + countNodes(root.left) + countNodes(root.right);
        
    }
}
