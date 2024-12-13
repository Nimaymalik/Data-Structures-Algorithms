package Deptfirstsearch;

public class validateBST {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public boolean isValidBST(TreeNode root) {
        return helper(root, null, null);
    }

    public boolean helper(TreeNode node, Integer left, Integer right) {

        if (node == null) {
            return true;
        }
        if (left!=null && node.val <= left) {
            return false;

        }
        if (right!=null && node.val >= right) {
            return false;
        }
        boolean leftTree=helper(node.left, left, node.val);
        boolean rightTree=helper(node.right, node.val, right);

        return leftTree && rightTree;

    }

    public static void main(String[] args) {

    }

}
