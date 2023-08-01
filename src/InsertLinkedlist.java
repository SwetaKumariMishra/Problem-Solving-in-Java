public class InsertLinkedlist {
    static Node head;
    static class Node{
        int data;
        Node next;

        Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }

     public void insertAtBeginning(int data)
    {
        Node temp = new Node(data);
        temp.next = head;
        head = temp;
    }

    public static void main(String[] args) {



    }
}
