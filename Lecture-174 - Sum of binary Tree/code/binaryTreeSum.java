

//User function Template for Java



class BinaryTree
{
    static int sumBT(Node head){
        //Code
        if(head == null) return 0;
        int leftSum = sumBT(head.left);
        int rightSum = sumBT(head.right);
        return (leftSum+rightSum + head.data);
    }
}