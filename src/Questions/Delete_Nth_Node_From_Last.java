package Questions;

public class Delete_Nth_Node_From_Last {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head.next == null) return null;

        ListNode curr = head;
        int size = 0;
        while (curr != null) {
            curr = curr.next;
            size++;
        }
        int indexToBeSearch = size - n;

        if (n == size) return head.next;

        ListNode prev = head;
        int i = 1;

        while (i < indexToBeSearch) {
            prev = prev.next;
            i++;
        }

        prev.next = prev.next.next;
        return head;
    }
}
