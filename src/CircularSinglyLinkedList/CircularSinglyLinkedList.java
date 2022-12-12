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
        } else {
            Node tempNode = head;
            int index = 0;

            while (index <= loc - 1) {
                tempNode = tempNode.next;
                index++;
            }
            node.next = tempNode.next;
            tempNode.next = node;
        }
        size++;
    }

    //Terversal
    public void terversalCSLL() {
        if (head != null) {
            Node tempNode = head;
            for (int i = 0; i < size; i++) {
                System.out.print(tempNode.value);
                if (i != size - 1) {
                    System.out.print("-->");
                }
                tempNode = tempNode.next;
            }
            System.out.println("\n");
        } else {
            System.out.println("Circular Linked List is Not Exist");

        }

    }
    // Search Method

    public boolean searchNode(int nodeValue) {
        if (head != null) {
            Node tempNode = head;
            for (int i = 0; i < size; i++) {
                if (tempNode.value == nodeValue) {
                    System.out.print("Found node at location: " + i + "\n");
                    return true;
                }
                tempNode = tempNode.next;
            }
        }
        System.out.println("Node not found! ");
        return false;
    }


    // Delete Method

    public void deleteNode(int location) {
        if (head == null) {
            System.out.println("The CSLL does not exist! ");
            return;
        } else if (location == 0) {
            head = head.next;
            tail.next = head;
            size--;
            if (size == 0) {
                tail = null;
                head.next = null;
                head = null;
            }
        } else if (location >= size) {
            Node tempNode = head;
            for (int i = 0; i < size - 1; i++) {
                tempNode = tempNode.next;
            }
            if (tempNode == head) {
                head.next = null;
                tail = head = null;
                size--;
                return;
            }
            tempNode.next = head;
            tail = tempNode;
            size--;
        } else {
            Node tempNode = head;
            for (int i = 0; i < location - 1; i++) {
                tempNode = tempNode.next;
            }
            tempNode.next = tempNode.next.next;
            size--;
        }
    }

    // Delete CSLL
    public void deleteCSLL() {
        if (head == null) {
            System.out.println("The CSLL does not exist!");
        } else {
            head = null;
            tail.next = null;
            tail = null;
            System.out.println("The CSLL has been deleted!");
        }
    }
}
