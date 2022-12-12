package CircularSinglyLinkedList;

public class TestCircularSinglyLL {
    public static void main(String[] args) {
        CircularSinglyLinkedList csLL = new CircularSinglyLinkedList();


        csLL.insertCSLL(1, 0);
        csLL.insertCSLL(2, 1);
        csLL.insertCSLL(3, 2);
        csLL.insertCSLL(4, 3);
        csLL.insertCSLL(5, 4);

        csLL.terversalCSLL();
        csLL.searchNode(3);

        csLL.terversalCSLL();

    }
}
