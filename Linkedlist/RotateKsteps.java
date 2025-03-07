package Linkedlist;

public class RotateKsteps {
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
        if (head == null) {
            return head;
        }

        ListNode curr = head;
        int size = 0;

        while (curr != null) {
            curr = curr.next;
            size++;
        }

        k = k % size;

        if (k == 0) {
            return head;
        }
        curr = head;
        ListNode newhead = curr.next;
        for (int i = 0; i < size - k - 1; i++) {
            curr = curr.next;
            newhead = curr.next;

        }
        curr.next = null;
        curr = newhead;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = head;

        return newhead;
    }

    public static void printList(ListNode head) {
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val + " -> ");
            curr = curr.next;
        }
        System.out.println("null");

    }

    public static void main(String[] args) {
        RotateKsteps rot = new RotateKsteps();

        // creading linkList
        ListNode head = rot.new ListNode(1);
        head.next = rot.new ListNode(2);
        head.next.next = rot.new ListNode(3);
        head.next.next.next = rot.new ListNode(4);
        head.next.next.next.next = rot.new ListNode(5);

        System.out.println("Original List:");
        printList(head);

        System.out.println("After rotation");
        head = rot.rotateRight(head, 2);
        printList(head);

    }

}
