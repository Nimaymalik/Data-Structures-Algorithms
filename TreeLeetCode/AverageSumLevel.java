//question 102
package TreeLeetCode;

import java.util.*;

public class AverageSumLevel {

      class TreeNode {
        TreeNode left;
        TreeNode right;
        int val;

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

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();

        // base condition
        if (root == null) {
            return result;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            List<Integer> currentLevel = new ArrayList<>();

            for (int i = 0; i < levelSize; i++) {
                TreeNode currentNode = queue.poll();
                currentLevel.add(currentNode.val);
                if (currentNode.left != null) {
                    queue.offer(currentNode.left);
                }
                if (currentNode.right != null) {
                    queue.offer(currentNode.right);
                }

            }
            result.add(currentLevel);
        }
        return result;

    }

    public static void main(String[] args) {
        AverageSumLevel sol = new AverageSumLevel();
        TreeNode root = sol.new TreeNode(3);
        root.left = sol.new TreeNode(9);
        root.right = sol.new TreeNode(20);
        root.left.left = sol.new TreeNode(15);
        root.left.right = sol.new TreeNode(7);

        List<List<Integer>> result = sol.levelOrder(root);
        System.out.println(result);

    }

}
