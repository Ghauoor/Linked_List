package Basics;

public class Main {
    public static void main(String[] args) {
        //Create Simple Linked List
        Node<Integer> num = new Node<>(10);
        Node<Integer> num2 = new Node<>(10);
        Node<Integer> num3 = new Node<>(10);
        Node<Integer> num4 = new Node<>(10);
        //Connect the Node With Each Other To create a Linked List
         Node head = num;
         head.next = num2;
         num2.next = num3;
         num3.next = num4;
         //Tail
         num4.next = null;





        SinglyLinkList list = new SinglyLinkList();


    }
}
