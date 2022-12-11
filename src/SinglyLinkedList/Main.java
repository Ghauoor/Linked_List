package SinglyLinkedList;

public class Main {
    public static void main(String[] args) {

        SinglyLinkedList sLL = new SinglyLinkedList();

        // System.out.println(sLL.head.value);

        sLL.insertLinkedList(1, 0);
        sLL.insertLinkedList(2, 1);
        sLL.insertLinkedList(3, 2);
        sLL.insertLinkedList(4, 3);
        sLL.insertLinkedList(5, 4);
        // System.out.println(sLL.head.value);

        sLL.deletionOfNode(4);
        sLL.traverseSLL();


    }
}
