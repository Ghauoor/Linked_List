package Basics;

public class DLL {
    private Node head;
    private int size;

    public DLL() {
        this.size = 0;
    }

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if (head != null) {
            head.prev = node;
        }
        head = node;
        size++;
    }

    public void display() {
        Node node = head;
        //for last index
        Node last = null;
        while (node != null) {
            last = node;
            System.out.print(node.val + " -> ");
            node = node.next;
        }
        System.out.println("END");
        System.out.println("Print in Reverse...");

        //Reverse the DLL
        while (last != null) {
            System.out.print(last.val + " --> ");
            last = last.prev;
        }
        System.out.println("START");

    }

    //insert last
    public void insertLast(int val) {
        Node node = new Node(val);
        Node last = head;
        node.next = null;

        //if DLL is Empty
        if (head == null) {
            node.next = null;
            head = node;
            return;
        }

        while (last.next != null) {
            last = last.next;
        }

        last.next = node;
        node.prev = last;
        size++;
    }

    //insert At index
    public void insertAtIndex(int index, int val) {
        if (index == 0) {
            insertFirst(val);
            return;
        }
        if (index == size) {
            insertLast(val);
            return;
        }
        Node tempNode = head;
        for (int i = 0; i < index; i++) {
            tempNode = tempNode.next;
        }
        Node reqNode = new Node(val);
        tempNode.next = reqNode;
        size++;
    }

    //Insert Node after Particular Node
    public void insertAfterVal(int after, int val) {
        Node p = find(after);

        if (p == null) {
            System.out.println("Node does not exist");
            return;
        }

        Node node = new Node(val);
        node.next = p.next;
        p.next = node;
        node.prev = p;
        if (node.next != null) {
            node.next.prev = node;
        }
    }

    //Find Node
    public Node find(int value) {
        Node node = head;
        while (node != null) {
            if (node.val == value) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    private class Node {
        private int val;
        private Node next;
        private Node prev;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }
}
