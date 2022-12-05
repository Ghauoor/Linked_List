package Basics;

class LL {

    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size = 0;
    }

    //Head Insertion
    public void insertFirst(int val) {
        Node node = new Node(val);

        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }
        size += 1;
    }

    //Tail Insertion
    public void insertLast(int val) {

        if (tail == null) {
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }



    public void insertIndexAt(int val, int index) {
        if (index == 0) {
            insertFirst(val);
            return;
        }
        if (index == size) {
            insertLast(val);
            return;
        }

        Node prevNode = head;
        // Have to find the ref of the previous node
        // i is not start from zero because temp it self start from zero so i start from 1...
        for (int i = 1; i < index; i++) {
            prevNode = prevNode.next;
        }

        Node node = new Node(val, prevNode.next);
        prevNode.next = node;

        size++;
    }


    //Display the LinkedList
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " --> ");
            temp = temp.next;
        }
        System.out.println("END...");
    }

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
