//Given the root of a binary tree and an integer targetSum, return true if the tree has a root-to-leaf
// path such that adding up all the values along the path equals targetSum.

import java.util.Stack;

class Node4{
    int val;
    Node4 left, right;

    Node4(int val)
    {
        this.val = val;
        left = right = null;
    }
}

public class PathSum {

    public static boolean hasPathSum(Node4 root, int targetSum)
    {
        if(root == null)
        {
            return false;
        }

        Stack<Node4> path = new Stack<>();
        Stack<Integer> pathSum = new Stack<>();

        path.push(root);
        pathSum.push(root.val);

        while (!path.isEmpty())
        {
            Node4 temp = path.pop();
            int tempVal = pathSum.pop();

            if (temp.right == null && temp.left == null)
            {
                if (tempVal == targetSum)
                    return true;
            }

            if(temp.right != null)
            {
                path.push(temp.right);
                Integer push = pathSum.push(tempVal + temp.right.val);
            }
            if(temp.left != null)
            {
                path.push(temp.left);
                pathSum.push( tempVal + temp.left.val);
            }

        }
        return false;
    }

    public static void main(String[] args) {

        Node4 root = new Node4(10);
        root.left = new Node4(8);
        root.right = new Node4(2);
        root.left.left = new Node4(3);
        root.left.right = new Node4(5);
        root.right.left = new Node4(2);

        int targetSum = 23;
        if(hasPathSum(root, targetSum))
        {
            System.out.println("There is a root-to-leaf path with sum " + targetSum);
        } else {
            System.out.println("There is no root-to-leaf path with sum " + targetSum);
        }
    }
}
