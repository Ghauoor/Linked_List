package Basics;

public class CLL {
    private Node head;
    private Node tail;

    public CLL() {
        this.head = null;
        this.tail = null;
    }
    //insert val first

    public void insert(int val) {
        Node node = new Node(val);

        if (head == null) {
            head = node;
            tail = node;
            return;
        }
        tail.next = node;
        node.next = head;
        tail = node;
    }

    public void display() {
        Node node = head;

        if (head != null) {
            do {
                System.out.print(node.val + " --> ");
                node = node.next;
            } while (node != head);
        }
        System.out.println("HEAD");

    }


    private class Node {

        private int val;
        private Node next;

        public Node(int val) {
            this.val = val;
        }
    }
}
