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

    //Insert At Certain Index
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

    //Delete First LL
    public int deleteFirst() {
        int val = head.value;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        return val;
    }

    public int deleteLast() {
        if (size <= 1) {
            return deleteFirst();
        }
        Node secondLast = getNode(size - 2);
        int val = tail.value;
        tail = secondLast;
        tail.next = null;
        size--;
        return val;
    }

    // Delete any index
    public int deleteAtIndex(int index) {
        if (index == 0) {
            return deleteFirst();
        }
        if (index == size - 1) {
            return deleteLast();
        }

        Node prev = getNode(index - 1);
        int val = prev.next.value;
        prev.next = prev.next.next;
        size--;
        return val;
    }

    //Find Any Node
    public boolean findNode(int value) {

        if (head != null) {
            Node tempNode = head;

            for (int i = 0; i < size; i++) {
                if (tempNode.value == value) {
                    System.out.println("Found At Location: " + i);
                    return true;
                }
                tempNode = tempNode.next;
            }
        }
        System.out.println("Value is Not Found!  ");
        return false;
    }


    //Get the DoublyNode ref
    private Node getNode(int index) {
        Node node = head;

        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    //insertion using recursion
    public void insertRec(int val, int index) {
        head = insertRec(val, index, head);

    }
    private Node insertRec(int val, int index, Node node) {
        if (index == 0) {
            Node temp = new Node(val, node);
            size++;

            return temp;
        }

        node.next = insertRec(val, index--, node.next);
        return node;
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
