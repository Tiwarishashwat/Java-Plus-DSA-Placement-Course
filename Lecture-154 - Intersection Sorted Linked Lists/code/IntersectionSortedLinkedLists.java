

//  Node of a linked list
 class Node {
   int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}


class Sol
{
   public static Node findIntersection(Node head1, Node head2)
    {
        // code here.
        Node t1 = head1;
        Node t2 = head2;
        // Node resHead = null;
        Node resHead = new Node(-1);
        Node resTail = resHead;
        while(t1!=null && t2!=null){
            if(t1.data==t2.data){
                // if(resHead == null){
                //     resHead = new Node(t1.data);
                //     resTail = resHead;
                // }else {
                    resTail.next = new Node(t1.data);
                    resTail = resTail.next;
                // }
                t1 = t1.next;
                t2 = t2.next;
            } else if(t1.data < t2.data){
                t1 = t1.next;
            } else {
                t2 = t2.next;
            }
        }
        Node temp = resHead;
        resHead = resHead.next;
        temp.next = null;
        return resHead;
    }
    
    
    
    
    
}