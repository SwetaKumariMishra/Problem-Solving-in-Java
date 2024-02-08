//Given a binary tree, find its minimum depth.
//The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.

class Node3{
    int val;
    Node3 left, right;

    Node3(int val)
    {
        this.val = val;
        left = right = null;
    }
}


public class MinimumBinaryTree {

    Node3 root;

    int minDepth(Node3 root)
    {
        if(root == null)
        {
            return 0;
        }
        int l = minDepth(root.left);
        int r = minDepth(root.right);

        if(root.left == null)
        {
            return 1 + minDepth(root.right);
        }

        if (root.right == null)
        {
            return 1 + minDepth(root.left);
        }

        return 1 + Math.min(l,r);
    }

    public static void main(String[] args) {

        MinimumBinaryTree min = new MinimumBinaryTree();

        min.root = new Node3(2);
        min.root.right = new Node3(3);
        min.root.right.right = new Node3(4);
        min.root.right.right.right = new Node3(5);
        min.root.right.right.right.right = new Node3(6);

        System.out.println("Minimum Depth of Binary tree is : " + min.minDepth(min.root));
    }
}
