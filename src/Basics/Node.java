package Basics;

public class Node<T> {
    T data;
    Node next;

    Node(T data) {
        this.data = data;
    }

    public void traverse(Node<Integer> head) {
        Node<Integer> curser = head;

        while (curser != null) {
            System.out.print(curser.data + "-->");
            curser = curser.next;
        }
        System.out.println("END");

    }
}
