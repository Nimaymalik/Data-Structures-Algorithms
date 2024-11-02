import java.util.Scanner;

public class binarytree {

    public binarytree() {
    }

    private static class Node {
        private int value;
        private Node left;
        private Node right;

        public Node(int value) {// constructor
            this.value = value;
        }
    }

    private Node root;

    // insert root node
    public void populate(Scanner scanner) {
        System.out.println("Enter the root Node value:");
        int value = scanner.nextInt();
        root = new Node(value);
        populate(scanner, root);

    }

    // inserting the left node
    public void populate(Scanner scanner, Node node) {
        System.out.println("Do you want to enter the left of " + node.value);
        boolean left = scanner.nextBoolean();
        if (left) {
            System.out.println("Enter the left value " + node.value);
            int value = scanner.nextInt();
            node.left = new Node(value);
            populate(scanner, node.left);
        }

        // inserting the right node
        System.out.println("Do you want to enter the right of " + node.value);
        boolean right = scanner.nextBoolean();
        if (right) {
            System.out.println("Enter the right value" + node.value);
            int value = scanner.nextInt();
            node.right = new Node(value);
            populate(scanner, node.right);

        }

    }

    public void display() {
        display(root, " ");

    }

    private void display(Node node, String indent) {
        if (node == null) {
            return;
        }
        System.out.println(indent + node.value);
        display(node.left, indent + "\t");
        display(node.right, indent + "\t");

    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        binarytree tree = new binarytree();
        tree.populate(scanner);
        tree.display();

    }
}
