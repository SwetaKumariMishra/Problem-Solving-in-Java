//Given an integer array nums where the elements are sorted in ascending order, convert it to a
//height-balanced binary search tree.

class Node2{
    int val;
    Node2 left;
    Node2 right;

    Node2(int val)
    {
        this.val = val;
        left = right = null;
    }
}


public class ConvertArrayToBST {

    static Node2 root;
    public Node2 sortedArrayToBST(int [] nums, int start, int end)
    {
        if(start > end)
        {
            return null;
        }

        int mid = start + (end - start)/2;
        Node2 node = new Node2(nums[mid]);

        node.left = sortedArrayToBST(nums, start, mid-1);
        node.right= sortedArrayToBST(nums, mid+1, end);

        return node;
    }

    void preOrder(Node2 node)
    {
        if (node == null) {
            return;
        }
        System.out.print(node.val + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    public static void main(String[] args) {

        ConvertArrayToBST tree = new ConvertArrayToBST();
        int nums [] = new int[] {1,2,3,4,5,6,7};
        int n = nums.length;
        root = tree.sortedArrayToBST(nums, 0, n - 1);
        System.out.println(
                "Preorder traversal of constructed BST");
        tree.preOrder(root);

    }
}
