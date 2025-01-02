package TreeLeetCode;


public class BinaryTreeSlideView {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode next;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right,TreeNode next) {
            this.val = val;
            this.left = left;
            this.right = right;
            this.next=next;

        }
    }

    // public List<Integer> rightSideView(TreeNode root) {
    //     if (root == null) {
    //         return null;
    //     }
    //     TreeNode rightMost=root;
    //     while(rightMost.next!=null){

    //     }
    //     return root;


    // }

    public static void main(String[] args) {
        // BinaryTreeSlideView sol = new BinaryTreeSlideView();
        // TreeNode root = sol.new TreeNode(1);
        // root.left = sol.new TreeNode(9);
        // root.right = sol.new TreeNode(20);
        // root.left.left = sol.new TreeNode(15);
        // root.left.right = sol.new TreeNode(7);

        // List<Integer> result = sol.rightSideView(root);
        // System.out.println(result);

    }

}
