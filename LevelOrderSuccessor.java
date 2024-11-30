//question 102
package TreeLeetCode;

import java.util.*;

public class LevelOrderSuccessor {
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

    public TreeNode findSuccessor(TreeNode root, int key) {

        // base condition
        if (root == null) {
            return null;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {

            TreeNode currentNode = queue.poll();
            if (currentNode.left != null) {
                queue.offer(currentNode.left);
            }
            if (currentNode.right != null) {
                queue.offer(currentNode.right);
            }
            if (currentNode.val == key) {
                break;
            }

        }
        return queue.peek();

    }

    public static void main(String[] args) {
        LevelOrderSuccessor ans = new LevelOrderSuccessor();
        TreeNode root=ans.new TreeNode(3);
         root.left=ans.new TreeNode(4);
         root.right=ans.new TreeNode(8);
         root.right.left=ans.new TreeNode(7);
         root.right.right=ans.new TreeNode(11);
         root.right.right.left=ans.new TreeNode(12);
         root.right.right.left.right=ans.new TreeNode(44);
         root.left.left=ans.new TreeNode(12);
         root.left.right=ans.new TreeNode(14);
         root.left.right.left=ans.new TreeNode(36);
         root.left.right.right=ans.new TreeNode(9);


        TreeNode result=ans.findSuccessor(root, 11);

        System.out.println(result.val);

    }

}
