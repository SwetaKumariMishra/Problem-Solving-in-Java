import java.util.Stack;

public class PalindromeInLinkedlist {

    public static void main(String[] args) {

        Node one = new Node(1);
        Node two = new Node(2);
        Node three = new Node(3);
        Node four = new Node(1);

        one.next = two;
        two.next = three;
        three.next = four;
        boolean condition = isPalindrome(one);
        System.out.println("isPalindrome: " +condition);
    }

    static boolean isPalindrome(Node head)
    {
        Node slow = head;
        boolean isPalin = true;
        Stack<Integer> stack = new Stack<Integer>();

        while (slow!=null)
        {
            stack.push(slow.data);
            slow = slow.next;
        }

        while (head!=null)
        {
            int i = stack.pop();
            if(head.data == i)
            {
                isPalin = true;
            }
            else {
                isPalin = false;
                break;
            }
            head = head.next;
        }
        return isPalin;
    }
}

class Node{
    int data;
    Node next;

    Node(int d)
    {
        this.data = d;
        this.next = null;
    }
}
