package CircularSinglyLinkedList;

public class CircularSinglyLinkedList {
    public Node head;
    public Node tail;
    public int size;


    public Node createCircularLinkedList(int nodeVal) {
        head = new Node();
        Node node = new Node();
        node.value = nodeVal;
        node.next = node;
        head = node;
        tail = node;
        size = 1;
        return head;
    }

    public void insertCSLL(int nodeVal, int loc) {
        Node node = new Node();
        node.value = nodeVal;

        if (head == null) {
            createCircularLinkedList(nodeVal);
            return;
        } else if (loc == 0) {
            node.next = head;
            head = node;
            tail.next = head;

        } else if (loc >= size) {
            tail.next = node;
            tail = node;
            node.next = head;
        }


    }
}
