package Deptfirstsearch;

public class MaximumDeptOfTree {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        };

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);

        return Math.max(left, right) + 1;

    }

    public static void main(String[] args) {

        MaximumDeptOfTree max = new MaximumDeptOfTree();
        TreeNode root = max.new TreeNode(3);
        root.left = max.new TreeNode(4);
        root.right = max.new TreeNode(20);
        root.right.left = max.new TreeNode(15);
        root.right.right = max.new TreeNode(15);

        System.out.println("Original Tree:");
        max.printTree(root);

        int dept = max.maxDepth(root);

        System.out.println("\ndept of Tree:" + dept);

    }

    public void printTree(TreeNode root) {
        if (root == null)
            return;

        System.out.print(root.val + " ");
        printTree(root.left);
        printTree(root.right);
    }
}
