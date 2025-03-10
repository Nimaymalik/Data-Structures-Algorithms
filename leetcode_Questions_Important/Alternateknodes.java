package leetcode_Questions_Important;

public class Alternateknodes {
    class ListNode {
        int val;
        ListNode next;

        ListNode() {
        };

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

    }

    public ListNode reverseKGroup(ListNode head, int k) {
        // base condition
        if (k <= 1 || head == null) {
            return head;
        }
        ListNode current = head;
        ListNode prev = null;

        while (current != null) {
            ListNode last = prev;
            ListNode newEnd = current;
            ListNode next = current.next;
            for (int i = 0; current != null && i < k; i++) {
                current.next = prev;
                prev = current;
                current = next;
                if (next != null) {
                    // next=next.null;
                }

            }
            if (last != null) {
                last.next = prev;
            } else {
                head = prev;

            }
            newEnd.next = current;

            for (int i = 0; current != null && i < k; i++) {
                prev = current;
                current = current.next;

            }

        }
        return head;

    }

}
