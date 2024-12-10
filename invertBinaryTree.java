package Deptfirstsearch;

public class invertBinaryTree {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        };

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        };
    }

    public TreeNode invertTree(TreeNode root) {

        if (root == null) {
            return null;
        }
        
        TreeNode temp=root.left;
        root.left=root.right;
        root.right=temp;

        invertTree(root.left);
        invertTree(root.right);

        return root;

    }
  
   

    public static void main(String[] args) {
        invertBinaryTree bt=new invertBinaryTree();
        TreeNode root=bt.new TreeNode(2);
        root.left=bt.new TreeNode(1);
        root.right=bt.new TreeNode(3);

        System.out.println("Original Tree:");
        bt.printTree(root);

        root = bt.invertTree(root);

        System.out.println("\nInverted Tree:");
        bt.printTree(root);
    }
    

    public void printTree(TreeNode root) {
        if (root == null) return;

        System.out.print(root.val + " ");
        printTree(root.left);
        printTree(root.right);
    }

    }

