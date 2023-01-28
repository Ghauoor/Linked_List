package Questions;

public class Give_Nth_Node_From_Last {
    int getNthFromLast(Node head, int n) {
        if (head == null) return 0;

        Node first = head;
        Node second = head;

        for (int i = 0; i < n; i++) {
            if (second == null) return -1;
            second = second.next;
        }

        while (second != null) {
            first = first.next;
            second = second.next;
        }

        return first.val;
    }
}
