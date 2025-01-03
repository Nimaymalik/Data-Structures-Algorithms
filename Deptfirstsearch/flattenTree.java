package Deptfirstsearch;

public class flattenTree {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        };

        TreeNode(int val) {
            this.val = val;
        };

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        };
    }

    public void flatten(TreeNode root) {

        // preorder traversal
        TreeNode current = root;

        while (current != null) {
            if (current.left != null) {

                TreeNode temp = current.left;
                while (temp.right != null) {
                    temp = temp.right;
                }
                temp.right = current.right;
                current.right = current.left;
                current.left = null;

            }
            current = current.right;

        }

    }

    public static void main(String[] args) {

    }
}
