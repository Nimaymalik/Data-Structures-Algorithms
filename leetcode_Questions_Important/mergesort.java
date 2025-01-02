package leetcode;


public class mergesort {

    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode mid = getmid(head);
        ListNode left = sortList(head);
        ListNode right = sortList(mid);
        return merge(left, right);

    }

    static ListNode merge(ListNode left, ListNode right) {
        return right;

    }

    static ListNode getmid(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        do {
            slow = slow.next;
            fast = fast.next.next;
        } while (fast.next.next != null || fast.next != null);

        return slow;

    }

    class ListNode {
        int val;
        ListNode next;
        ListNode head;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

}
