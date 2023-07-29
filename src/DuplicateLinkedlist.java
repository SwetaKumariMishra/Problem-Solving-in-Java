import java.util.HashSet;

public class DuplicateLinkedlist {
    static Node head;
    static class Node{
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static void removeDuplicate(Node head) {

        HashSet<Integer> set = new HashSet<>();

        Node curr = head;
        Node prev = null;

        while (curr!=null)
        {
            int curval = curr.data;

            if(set.contains(curval))
            {
                prev.next = curr.next;
            }
            else {
                set.add(curval);
                prev = curr;
            }
            curr = curr.next;
        }

    }

    static void printList(Node head)
    {
        while (head!=null)
        {
            System.out.println(head.data + " ");
            head = head.next;
        }
    }

    public static void main(String[] args) {
        DuplicateLinkedlist list = new DuplicateLinkedlist();
         list.head = new Node(10);
         list.head.next = new Node(20);
         list.head.next.next = new Node(30);
         list.head.next.next.next = new Node(10);
         list.head.next.next.next.next = new Node(5);
         list.head.next.next.next.next.next = new Node(30);

        System.out.println("Linkedlist before removing duplicates:");
        list.printList(head);
        removeDuplicate(head);
        System.out.println(" ");
        System.out.println("Linkedlist after removing dupliactes:");
        list.printList(head);

    }
}
