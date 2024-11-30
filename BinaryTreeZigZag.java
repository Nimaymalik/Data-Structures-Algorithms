//question 102
package TreeLeetCode;

import java.util.*;

public class BinaryTreeZigZag {
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

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();

        // base condition
        if (root == null) {
            return result;
        }
        Boolean rev = false;

        Deque<TreeNode> deque = new LinkedList<>();
        deque.offerFirst(root);

        while (!deque.isEmpty()) {
            int levelSize = deque.size();
            List<Integer> currentLevel = new ArrayList<>();

            for (int i = 0; i < levelSize; i++) {
                if (!rev) {
                    TreeNode currentNode = deque.pollFirst();
                    currentLevel.add(currentNode.val);

                    if (currentNode.left != null) {
                        deque.addLast(currentNode.left);
                    }

                    if (currentNode.right != null) {
                        deque.addLast(currentNode.right);
                    }
                } else {
                    TreeNode currentNode = deque.pollLast();
                    currentLevel.add(currentNode.val);

                    if (currentNode.right != null) {
                        deque.addFirst(currentNode.right);
                    }
                    if (currentNode.left != null) {
                        deque.addFirst(currentNode.left);
                    }

                }

     
            }
            rev = !rev;
            result.add(currentLevel);
        }
        return result;

    }

    public static void main(String[] args) {
        BinaryTreeZigZag ans = new BinaryTreeZigZag();
        TreeNode root = ans.new TreeNode(3);
        root.left = ans.new TreeNode(9);
        root.right = ans.new TreeNode(20);
        root.right.left = ans.new TreeNode(15);
        root.right.right = ans.new TreeNode(7);

        List<List<Integer>> result = ans.zigzagLevelOrder(root);

        System.out.println(result);

    }

}
