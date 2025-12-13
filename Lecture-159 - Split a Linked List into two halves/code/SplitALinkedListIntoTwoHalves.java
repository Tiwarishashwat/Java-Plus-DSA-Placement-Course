

//  Node of a linked list
 class Node {
   int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}


class gfg
{
        // Function  to split a circular LinkedList
	    void splitList(circular_LinkedList list)
        {
             //DO NOT REMOVE THESE 3 LINES
             Node head=list.head;
             Node head1=null;
             Node head2=null;
             
             //Modify these head1 and head2 here, head is the starting point of our original linked list.    
             
             Node slow = head;
             Node fast = head;
             while(fast.next!=head && fast.next.next!=head){
                 slow = slow.next;
                 fast = fast.next.next;
             }
             head2 = slow.next;
             head1 = head;
             slow.next = head1;
             if(fast.next==head){
                 fast.next = head2;
             }else{
                 fast.next.next = head2;
             }
             
             //DO NOT REMOVE THESE 2 LINES
             list.head1=head1;
             list.head2=head2;
	 }
}
