package Top150Questions;

import java.util.PriorityQueue;

public class KthsmallestElemnt {
    class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(TreeNode left, TreeNode right, int val) {
            this.val = val;
            this.right = right;
            this.left = left;
        }
    }

    public int KthsmallestElemnt(TreeNode root, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        helper(root, queue, k);

        // remove k elements
        int ans = 0;

        for (int i = 0; i < k; i++) {
            ans = queue.poll();

        }
        return ans;
    }

    private void helper(TreeNode root, PriorityQueue<Integer> queue, int k) {
        if (root == null) {
            return;
        }

        helper(root.left, queue, k);
        queue.offer(root.val);
        helper(root.right, queue, k);

    }

    public static void main(String[] args) {
        KthsmallestElemnt ans = new KthsmallestElemnt();

    }

}
