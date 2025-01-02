//question 102
package TreeLeetCode;

import java.util.*;

public class BinaryTreeLevelOrder2 {
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

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();

        // base condition
        if (root == null) {
            return result;
        }
        Deque<TreeNode> deque = new LinkedList<>();
        deque.offerFirst(root);

        while (!deque.isEmpty()) {
            int levelSize = deque.size();
            List<Integer> currentLevel = new ArrayList<>();

            for (int i = 0; i < levelSize; i++) {

                TreeNode currentNode = deque.pollLast();
                currentLevel.add(currentNode.val);

                if (currentNode.left != null) {
                    deque.addFirst(currentNode.left);
                }
                if (currentNode.right != null) {
                    deque.addFirst(currentNode.right);
                }

            }
            result.add(currentLevel);
        }
        return result.reversed();

    }

    public static void main(String[] args) {
        BinaryTreeLevelOrder2 ans = new BinaryTreeLevelOrder2();
        TreeNode root = ans.new TreeNode(3);
        root.left = ans.new TreeNode(9);
        root.right = ans.new TreeNode(20);
        root.right.left = ans.new TreeNode(15);
        root.right.right = ans.new TreeNode(7);

        List<List<Integer>> result = ans.levelOrderBottom(root);

        System.out.println(result);

    }

}
