
//  * Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode slow = head;
        ListNode fast = head;
        while (n >= 0 && fast != null) {
            n--;
            fast = fast.next;
        }
        // del head
        if (n == 0 && fast == null) {
            head = slow.next;
            slow.next = null;
            return head;
        }

        if (n != -1) { // not enough nodes
            return head;
        }
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }

        ListNode del = slow.next;
        slow.next = del.next;
        del.next = null;
        return head;
    }
}