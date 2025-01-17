package leetcode_Questions_Important;
class Solution {
    public class ListNode {
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

    public ListNode rotateRight(ListNode head, int k) {
        if (k <= 0 || head == null || head.next == null) {
            return head;
        }
        ListNode last = head;
        int length = 1;
        while (last.next != null) {
            last = last.next;
            length++;// 6
            // k=2
        }
        last.next = head;
        int rotation = k % length;// 2
        int skip = length - rotation;// 4
        ListNode newLast = head;
        for (int j = 0; j < skip - 1; j++) {
            newLast = newLast.next;

        }
        head = newLast.next;
        newLast.next = null;

        return head;
    }
}