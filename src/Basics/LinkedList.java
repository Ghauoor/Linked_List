package Basics;

public class LinkedList {
    public static void main(String[] args) {
        //Create Simple Linked List
        Node<Integer> num = new Node<>(1);
        Node<Integer> num2 = new Node<>(2);
        Node<Integer> num3 = new Node<>(3);
        Node<Integer> num4 = new Node<>(4);
        //Connect the Node With Each Other To create a Linked List
        Node<Integer> head = num;
        head.next = num2;
        num2.next = num3;
        num3.next = num4;
        //Tail
        num4.next = null;

        traverse(head);


    }

   public static void traverse(Node<Integer> head) {
        Node<Integer> curser = head;

        while (curser != null) {
            System.out.print(curser.data + "-->");
            curser = curser.next;
        }
       System.out.println("END");

    }
}
