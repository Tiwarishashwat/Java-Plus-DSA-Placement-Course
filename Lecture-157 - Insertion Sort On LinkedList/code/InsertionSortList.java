
//   Definition for singly-linked list.
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
    public ListNode insertionSortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode temp = head.next;
        ListNode sortedTail = head;
        while (temp != null) {
            // temp is already at sorted position (insertion at the tail)
            if (temp.val >= sortedTail.val) {
                sortedTail = temp;
                temp = temp.next;
                continue;
            }
            sortedTail.next = temp.next;
            // temp.next = null;
            ListNode prev = null;
            ListNode t1 = head;
            while (t1 != sortedTail.next) {
                if (t1.val >= temp.val) {
                    break;
                }
                prev = t1;
                t1 = t1.next;
            }
            // insert at head
            if (prev == null) {
                temp.next = head;
                head = temp;
            } else {
                // insert at specific pos
                temp.next = prev.next;
                prev.next = temp;
            }
            temp = sortedTail.next;
        }
        return head;
    }
}
