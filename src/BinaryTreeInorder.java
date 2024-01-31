//Given the root of a binary tree, return the inorder traversal of its nodes' values.
// Structure of a Binary Tree Node
class Node1 {
    int data;
    Node1 left, right;

    Node1(int v)
    {
        data = v;
        left = right = null;
    }
}

// Main class
class BinaryTreeInorder {

    // Function to print inorder traversal
    public static void printInorder(Node1 node)
    {
        if (node == null)
            return;

        // First recur on left subtree
        printInorder(node.left);

        // Now deal with the node
        System.out.print(node.data + " ");

        // Then recur on right subtree
        printInorder(node.right);
    }

    // Driver code
    public static void main(String[] args)
    {
        Node1 root = new Node1(1);
        root.left = new Node1(2);
        root.right = new Node1(3);
        root.left.left = new Node1(4);
        root.left.right = new Node1(5);
        root.right.right = new Node1(6);

        // Function call
        System.out.println(
                "Inorder traversal of binary tree is: ");
        printInorder(root);
    }
}
