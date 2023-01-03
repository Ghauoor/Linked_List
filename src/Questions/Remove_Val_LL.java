package Questions;

public class Remove_Val_LL {
    private ListNode removeValue(ListNode head, int val) {
        if (head == null) {
            return null;
        }

        head.next = removeValue(head.next, val);

        return head.val == val ? head.next : head;
    }
}
