import java.util.*;

public class ReverseLinkedList {
    static  Node head;
    static class Node{
        int data;
        Node next;

        Node(int data)
        {
            this.data = data;
            this.next = null;
        }
}
      Node reverse(Node node){
        Node prev = null;
        Node curr = node;
        Node next = null;

        while (curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;

        }

        node = prev;
        return node;
    }

    public void printList(Node node){
        while (node!=null)
        {
            System.out.print(node.data+ " ");
            node = node.next;
        }
    }

    public static void main(String[] args) {
        ReverseLinkedList list = new ReverseLinkedList();

        list.head = new Node(1);
        list.head.next = new Node(2);
        list.head.next.next = new Node(3);


        System.out.println("Given Linkedlist:");
        list.printList(head);
        head = list.reverse(head);
        System.out.println(" ");
        System.out.println("Reversed Linkedlist");
        list.printList(head);



    }
}
