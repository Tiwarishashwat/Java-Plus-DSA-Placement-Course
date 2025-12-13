
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
    public ListNode sortList(ListNode head) {
        return mergeSort(head);
    }

    public ListNode mergeSort(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;
        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = null;
        // recursive calls to break the list down
        ListNode head1 = mergeSort(head);
        ListNode head2 = mergeSort(slow);
        // merging them back
        ListNode ans = merge(head1, head2);
        return ans;
    }

    // merge two sorted linked list
    public ListNode merge(ListNode head1, ListNode head2) {
        ListNode ansHead = new ListNode(-1);
        ListNode ansTail = ansHead;
        while (head1 != null && head2 != null) {
            if (head1.val <= head2.val) {
                ansTail.next = new ListNode(head1.val);
                head1 = head1.next;
            } else {
                ansTail.next = new ListNode(head2.val);
                head2 = head2.next;
            }
            ansTail = ansTail.next;
        }
        while (head1 != null) {
            ansTail.next = new ListNode(head1.val);
            head1 = head1.next;
            ansTail = ansTail.next;
        }
        while (head2 != null) {
            ansTail.next = new ListNode(head2.val);
            head2 = head2.next;
            ansTail = ansTail.next;
        }
        ListNode t1 = ansHead;
        ansHead = ansHead.next;
        t1.next = null;
        return ansHead;
    }
}
