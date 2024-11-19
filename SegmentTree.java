public class SegmentTree {
    public static void main(String[] args) {
        int[] a = { 3, 8, 6, 7, -2, -8, 4, 9 };
        SegmentTree tree = new SegmentTree(a);

        System.out.println(tree.query(1, 6));
        
        // tree.display();
    }

    private static class Node {
        int data;
        int startInternval;
        int endInterval;
        Node left;
        Node right;

        public Node(int startInternval, int endInterval) {
            this.startInternval = startInternval;
            this.endInterval = endInterval;
        }
    }

    Node root;

    public SegmentTree(int[] a) {
        // create a tree using this array
        this.root = constructTree(a, 0, a.length - 1);
    }

    private Node constructTree(int[] a, int start, int end) {
        if (start == end) {
            // leaf node
            Node leaf = new Node(start, end);
            leaf.data = a[start];
            return leaf;
        }
        // creating the node
        Node node = new Node(start, end);
        int mid = (start + end) / 2;
        node.left = this.constructTree(a, start, mid);
        node.right = this.constructTree(a, mid + 1, end);
        node.data = node.left.data + node.right.data;

        return node;

    }

    public void display() {
        display(root);
    }

    public void display(Node node) {
        String str = "";
        if (node.left != null) {
            str = str + "Internval=[ " + node.left.startInternval + "-" + node.left.endInterval + "] and data"
                    + node.left.data + "-> ";

        } else {
            str = str + "No left child";
        }

        // for current child
        str = str + "Internval=[ " + node.startInternval + "-" + node.endInterval + "] and data"
                + node.data + "<-";

        if (node.right != null) {
            str = str + "Internval=[ " + node.right.startInternval + "-" + node.right.endInterval + "] and data"
                    + node.right.data + "-> ";

        } else {
            str = str + "No right child";
        }
        System.out.println(str);

        if (node.left != null) {
            display(node.left);
        }
        if (node.right != null) {
            display(node.right);
        }

    }

    public int query(int qsi, int qei) {
        return this.query(this.root, qsi, qei);
    }

    public int query(Node node, int qsi, int qei) {
        if (node.startInternval >= qsi && node.endInterval <= qei) {
            return node.data;

        } else if (node.startInternval > qei || node.endInterval < qsi) {
            return 0;
        } else {
            return this.query(node.left, qsi, qei) + this.query(node.right, qsi, qei);

        }

    }

    public void update(int index, int value) {
        this.root.data = update(this.root, index, value);
    }

    private int update(Node node, int index, int value) {

        if (index >= node.startInternval && index <= node.endInterval) {
            if (index == node.startInternval && index == node.endInterval) {
                node.data = value;
                return node.data;

            } else {
                int leftAns = update(node.left, index, value);
                int rightAns = update(node.right, index, value);
                node.data = leftAns + rightAns;
                return node.data;
            }
        }
        return node.data;
    }
}
