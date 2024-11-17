package BinarySearchTree;

class BinarySearchTree {

    public BinarySearchTree() {
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
        return node;

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

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();

        int[] nums = { 6, 5, 3, 7, 8 , 23,  42, 434 };
        tree.populate(nums);
        tree.display();

    }

}
