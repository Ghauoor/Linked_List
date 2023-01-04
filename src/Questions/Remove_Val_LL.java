package Questions;

public class Remove_Val_LL {
    private ListNode removeValue(ListNode head, int val) {
        if (head == null) {
            return null;
        }

        head.next = removeValue(head.next, val);

        return head.val == val ? head.next : head;
    }

    private ListNode remove(ListNode head, int val) {
        //check for head

        while (head != null && head.val == val) {
            head = head.next;
        }
        ListNode temp = head;
        while (head != null) {
            if (head.next != null && head.next.val == val) {
                head.next = head.next.next;
                continue;
            }

            head = head.next;
        }
        return temp;
    }
}
