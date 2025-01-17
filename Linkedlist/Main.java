package Linkedlist;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }

}

class Length {

    public int hascycle(ListNode head) {
        ListNode f = head;
        ListNode s = head;
        while (f != null && f.next != null) {
            s = s.next;
            f = f.next.next;
            if (s == f) {
                int count = 0;
                ListNode temp = s;

                do {
                    temp = temp.next;
                    count += 1;
                } while (temp != s);

                return count;
            }

        }
        return 0;

    }

    public ListNode detectcycle(ListNode head) {
        int len = 0;
        ListNode f = head;
        ListNode s = head;
        while (f != null && f.next != null) {
            f = f.next.next;
            s = s.next;
            if (f == s) {
                len = lengthllcycle(s);
                break;

            }
        }
        if (len == 0) {
            return null;
        }
        ListNode f1 = head;
        ListNode s1 = head;
        while (len > 0) {
            s1 = s1.next;
            len--;
        }

        while (f1 != s1) {
            f1 = f1.next;
            s1 = s1.next;
        }
        return s1;

    }

    private int lengthllcycle(ListNode s) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'lengthllcycle'");
    }

}

public class Main {

    public static void main(String[] args) {

        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        node5.next = node2;

        Length lengthChecker = new Length();
        System.out.println(lengthChecker.hascycle(node1));

    }
}
