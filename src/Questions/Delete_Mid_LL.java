package Questions;

public class Delete_Mid_LL {
    public ListNode deleteMiddle(ListNode head) {
        //Using Two Pointer Approach
        if (null == head || null == head.next) return null;
        ListNode slow = head, fast = head.next.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        slow.next = slow.next.next;
        return head;
    }

    private ListNode deleteMid(ListNode head) {
        if (null == head || null == head.next) return null;

        ListNode slow = head;
        ListNode fast = head;

        ListNode prev = null;

        while (fast != null && fast.next != null) {
            prev = slow;
            fast = fast.next.next;
            slow = slow.next;
        }

        prev.next = slow.next;

        return head;

    }
}
