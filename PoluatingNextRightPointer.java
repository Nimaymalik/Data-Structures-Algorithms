package TreeLeetCode;

public class PoluatingNextRightPointer {
    class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {
        }

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node left, Node right, Node next) {
            this.val = val;
            this.left = left;
            this.right = right;
            this.next = next;
        }

    }

    public Node connect(Node root) {
        if (root == null) {
            return null;
        }
        Node leftMost = root;
        while (leftMost.left != null) {
            Node current = leftMost;
            while (current != null) {
                current.left.next = current.right;
                if (current.next != null) {
                    current.right.next = current.next.left;

                }
                current = current.next;
            }
            leftMost = leftMost.left;

        }
        return root;
    }

    public static void main(String[] args) {
        PoluatingNextRightPointer ans = new PoluatingNextRightPointer();

        Node result = ans.new Node(1);
        result.left = ans.new Node(2);
        result.right = ans.new Node(3);
        result.left.left = ans.new Node(4);
        result.left.right = ans.new Node(5);
        result.left.left = ans.new Node(6);
        result.right.right = ans.new Node(7);

        Node print = ans.connect(result);
        System.out.println(print);

    }

}
