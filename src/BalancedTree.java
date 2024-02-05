// Given a binary tree, determine if it is height-balanced

class TreeNode1{
    int val;
    TreeNode1 left, right;

    TreeNode1(int val)
    {
        this.val = val;
        left = right = null;
    }
}
public class BalancedTree {
    TreeNode1 root;

    boolean isBalanced(TreeNode1 node)
    {
        int lh;
        int rh;

        if(node == null)
            return true;

        lh = height(node.left);
        rh = height(node.right);

        if (Math.abs(lh - rh) <= 1 && isBalanced(node.left)
                && isBalanced(node.right))
            return true;

        return false;
    }

    int height(TreeNode1 node)
    {
        /* base case tree is empty */
        if (node == null)
            return 0;

        /* If tree is not empty then height = 1 + max of
         left height and right heights */
        return 1 + Math.max(height(node.left), height(node.right));
    }

    public static void main(String args[])
    {
        BalancedTree tree = new BalancedTree();
        tree.root = new TreeNode1(1);
        tree.root.left = new TreeNode1(2);
        tree.root.right = new TreeNode1(3);
        tree.root.left.left = new TreeNode1(4);
        tree.root.left.right = new TreeNode1(5);
        tree.root.left.left.left = new TreeNode1(8);

        if (tree.isBalanced(tree.root))
            System.out.println("Tree is balanced");
        else
            System.out.println("Tree is not balanced");
    }
}

