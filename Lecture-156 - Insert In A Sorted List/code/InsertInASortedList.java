

class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }

// sortedInsert method should return the head of the modified linked list.
class Solution {
    Node sortedInsert(Node head1, int key) {
        // Add your code here.
        Node newNode = new Node(key);
        Node prev = null;
        Node temp = head1;
        while(temp!=null){
            if(temp.data>=key){
                break;
            }
            prev = temp;
            temp = temp.next;
        }
        if(prev == null){
            newNode.next = head1;
            head1 = newNode;
        }else{
            newNode.next = prev.next;
            prev.next = newNode;
        }
        return head1;
    }
}