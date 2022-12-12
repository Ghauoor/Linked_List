package CircularSinglyLinkedList;

public class TestCircularSinglyLL {
    public static void main(String[] args) {
        CircularSinglyLinkedList csLL = new CircularSinglyLinkedList();
        csLL.createCircularLinkedList(5);

        System.out.println(csLL.head.value);

    }
}
