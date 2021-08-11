public class syntax {

    public static class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static class LinkedList {

        Node head;
        Node tail;
        int size;

    }

    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        Node node1 = new Node(10);
        node1.next = null;
        list.head = node1;
        list.tail = node1;
        list.size++;

        Node node2 = new Node(20);
        list.tail.next = node2;
        node2.next = null;
        list.tail = node2;
        list.size++;

        Node node3 = new Node(30);
        list.tail.next = node3;
        node3.next = null;
        list.tail = node3;
        list.size++;

        Node temp = list.head;

        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}