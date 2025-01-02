package TreeLeetCode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Average {
    public class TreeNode {
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

    public List<Double> levelOrder(TreeNode root) {
        List<Double> result = new ArrayList<>();

        // base condition
        if (root == null) {
            return result;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            double average = 0;
            for (int i = 0; i < levelSize; i++) {
                TreeNode currentNode = queue.poll();
                average += currentNode.val;

                if (currentNode.left != null) {
                    queue.offer(currentNode.left);
                }
                if (currentNode.right != null) {
                    queue.offer(currentNode.right);
                }

            }
            average=average/levelSize;
            result.add(average);
        }
        return result;

    }

    public static void main(String[] args) {
        Average sol = new Average();
        TreeNode root = sol.new TreeNode(3);
        root.left = sol.new TreeNode(9);
        root.right = sol.new TreeNode(20);
        root.left.left = sol.new TreeNode(15);
        root.left.right = sol.new TreeNode(7);

        List<Double> result = sol.levelOrder(root);
        System.out.println(result);

    }

}
