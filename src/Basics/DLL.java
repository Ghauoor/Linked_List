package Basics;

public class DLL {
    Node head;

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if (head != null) {
            head.prev = node;
        }
        head = node;
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

        //Reverse the DLL
        while (last != null) {
            System.out.print(last.val + " --> ");
            last = last.prev;
        }
        System.out.println("START");

    }

    private class Node {
        int val;
        Node next;
        Node prev;

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
