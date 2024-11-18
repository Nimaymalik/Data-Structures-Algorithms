package AVL;

class AVL {

    public AVL() {
    };

    public class Node {
        private int value;
        private int height;
        private Node left;
        private Node right;

        public Node(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

    }

    private Node root;

    // returning the height
    public int height(Node node) {
        if (node == null) {
            return -1;
        }
        return node.height;
    }

    // root is empty or not
    public boolean isEmpty() {
        return root == null;
    }

    // insert root
    public void insert(int value) {

        root = insert(value, root);
    }

    private Node insert(int value, Node node) {
        if (node == null) {
            node = new Node(value);
            return node;

        }

        if (value < node.value) {
            node.left = insert(value, node.left);
        }
        if (value > node.value) {
            node.right = insert(value, node.right);
        }
        node.height = Math.max(height(node.left), height(node.right));
        return rotate(node);

    }

    private Node rotate(Node node) {
        if (height(node.left) - height(node.right) > 1) {
            // left case

            if (height(node.left.left) - height(node.left.right) > 0) {
                // left-left case
                return rightRotate(node);
            }
            if (height(node.left.left) - height(node.left.right) < 0) {
                // left-right case
                node.left = leftRotate(node.left);
                return rightRotate(node);
            }

        }
        if (height(node.right) - height(node.left) > 1) {
            // right case

            if (height(node.right.right) - height(node.right.left) > 0) {
                return leftRotate(node);
            }
            if (height(node.right.right) - height(node.right.left) < 0) {
                node.right = rightRotate(node.right);
                return leftRotate(node);
            }
        }

        return node;

    }

    private Node rightRotate(Node p) {
        Node c = p.left;
        Node t = c.right;
        c.right = p;
        p.left = t;

        p.height = Math.max(height(p.left), height(p.right) + 1);
        c.height = Math.max(height(c.left), height(c.right) + 1);
        return c;

    }

    private Node leftRotate(Node c) {
        Node p = c.right;
        Node t = p.left;
        p.left = c;
        c.right = t;

        p.height = Math.max(height(p.left), height(p.right) + 1);
        c.height = Math.max(height(c.left), height(c.right) + 1);
        return p;

    }

    public void display() {
        display(root, "Root Node");

    }

    public void display(Node node, String Indent) {
        if (node == null) {
            return;
        }
        System.out.println(Indent + node.getValue());
        display(node.left, "Left child of " + node.getValue() + ":");
        display(node.right, "right child of " + node.getValue() + ":");
    }

    public boolean balanced() {
        return balanced(root);

    }

    private boolean balanced(Node node) {
        if (node == null) {
            return true;
        }
        return Math.abs(height(node.left) - height(node.right)) <= 1 && balanced(node.left) && balanced(node.right);
    }

    public void populate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            this.insert(nums[i]);
        }
    }

    public void preOrder() {
        preOrder(root);
    }

    public void preOrder(Node node) {
        if (node == null) {
            return;
        }
        System.out.println(node.value);
        System.out.println(node.left);
        System.out.println(node.right);

    }

    public void InOrder() {
        preOrder(root);
    }

    public void InOrder(Node node) {
        if (node == null) {
            return;
        }
        System.out.println(node.left);
        System.out.println(node.value);
        System.out.println(node.right);
    }

    public void postOrder() {
        preOrder(root);
    }

    public void postOrder(Node node) {
        if (node == null) {
            return;
        }
        System.out.println(node.left);
        System.out.println(node.right);
        System.out.println(node.value);

    }

    public static void main(String[] args) {
        AVL tree = new AVL();

        int[] nums = { 6, 5, 3, 7, 8, 23, 42, 434 };
        tree.populate(nums);
        tree.display();

    }

}
