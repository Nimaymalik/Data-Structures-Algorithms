package linkedlistquestions;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class lengthllcycle {
    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        if (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                return true;

            }

        }
        return false;

    }

    // calculating length of the cycle
    public int length(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        if (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                int count = 0;
                ListNode temp = slow;
                do {
                    temp = temp.next;
                    count += 1;

                } while (temp != slow);

                return count;
            }
        }

        return 0;

    }

}
