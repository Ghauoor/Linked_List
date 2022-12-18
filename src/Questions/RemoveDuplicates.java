package Questions;

public class RemoveDuplicates {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode node = head;

        while (node != null) {

            if (node.next == null) break;

            if (node.val == node.next.val) {
                node.next = node.next.next;
            } else {
                node = node.next;
            }
        }
        return head;
    }
}
