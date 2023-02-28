package Questions;
//https://practice.geeksforgeeks.org/problems/reverse-a-doubly-linked-list/1?utm_source=gfg&utm_medium=article&utm_campaign=bottom_sticky_on_article
public class Reverse_Doubly_LinkedList {
    public static Node reverseDLL(Node head) {
        if (head == null || head.next == null) return head;
        Node curr = head;
        Node prev = null;

        while (curr != null) {
            Node forward = curr.next;
            curr.next = prev;
            curr.prev = forward;

            prev = curr;
            curr = forward;
        }

        return prev;
    }

    private class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
}
