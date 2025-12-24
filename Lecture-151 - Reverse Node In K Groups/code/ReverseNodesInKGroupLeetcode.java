
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
    private int findLen(ListNode head) {
        int c = 0;
        while (head != null) {
            head = head.next;
            c++;
        }
        return c;
    }

    public ListNode reverseKGroup(ListNode head, int k) {
        int n = findLen(head);
        int groups = n / k;
        ListNode curHead = head;
        ListNode cur = head;
        ListNode prevHead = null;
        for (int g = 0; g < groups; g++) {
            ListNode prev = null;
            for (int i = 0; i < k; i++) {
                ListNode nextNode = cur.next;
                cur.next = prev;
                prev = cur;
                cur = nextNode;
            }
            if (prevHead == null) {
                head = prev;
            } else {
                prevHead.next = prev;
            }
            prevHead = curHead;
            curHead = cur;
        }
        prevHead.next = curHead; // last group
        return head;
    }
}