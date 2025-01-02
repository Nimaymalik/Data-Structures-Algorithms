package leetcode;

class Solution {
    public class reverseLinkedList {
        int val;
        reverseLinkedList next;

        reverseLinkedList() {
        }

        reverseLinkedList(int val) {
            this.val = val;
        }

        reverseLinkedList(int val, reverseLinkedList next) {
            this.val = val;
            this.next = next;
        }
    }

    public reverseLinkedList reverseList(reverseLinkedList head) {
        if (head == null) {
            return head;
        }
        reverseLinkedList prev = null;
        reverseLinkedList present = head;
        reverseLinkedList next = present.next;

        while (present != null) {
            present.next = prev;
            prev = present;
            present = next;
            if (next != null) {
                next = next.next;
            }

        }
        return prev;

    }

    public static void main(String[] args) {

    }
}