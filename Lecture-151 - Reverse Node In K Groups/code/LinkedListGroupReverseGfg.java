

// node class of the linked list

class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}



class Solution
{
    public static Node reverse(Node node, int k)
    {
        //Your code here
        return reverseKGroup(node,k);
    }
     public static Node reverseKGroup(Node head, int K) {
        Node prevHead = null;
        Node currHead = head;
        Node ansNode = null;
        // for(int i=0;i<groups;i++){
        while(currHead!=null){
            Node prev = null;
            Node cur = currHead;
            Node nextNode = null;
            // Rev - K G
            // for(int j=0;j<K;j++){
            int j=0;
            while(j<K && cur!=null) {
                nextNode = cur.next;
                cur.next = prev;
                prev = cur;
                cur = nextNode;
                j++;
            }
            if(prevHead == null){
                ansNode = prev;
            }else {
                prevHead.next = prev;
            }
            prevHead = currHead;
            currHead = cur;
        }
        return ansNode;
    }
}













