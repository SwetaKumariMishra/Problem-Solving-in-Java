//Given the root of a binary tree, return its maximum depth.
//A binary tree's maximum depth is the number of nodes along the longest path from the root
// node down to the farthest leaf node.

class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
        left = right = null;
    }
}

public class MaximumBinaryTree {

    TreeNode root;

    int maxDepth(TreeNode root)
    {
        if(root == null)
            return 0;

        int l = maxDepth(root.left);
        int r = maxDepth(root.right);

        return Math.max(l,r) + 1;
    }

    public static void main(String[] args) {
        MaximumBinaryTree tree = new MaximumBinaryTree();

        tree.root = new TreeNode(1);
        tree.root.left = new TreeNode(2);
        tree.root.right = new TreeNode(3);
        tree.root.left.left = new TreeNode(4);
        tree.root.right.left = new TreeNode(5);
        tree.root.right.right = new TreeNode(7);
        tree.root.right.right.left = new TreeNode(8);

        System.out.println("Maximum depth of binary tree is: " + tree.maxDepth(tree.root));

    }
}
