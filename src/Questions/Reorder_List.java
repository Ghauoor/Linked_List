package Questions;

public class Reorder_List {
    public void reorderList(ListNode head) {
        if (head == null && head.next == null) return;

        ListNode mid = midOfList(head);
        ListNode headSec = reverseOfList(mid);
        ListNode headFirst = head;

        //re-arrange
        while (headFirst != null && headSec != null) {
            ListNode temp = headFirst.next;
            headFirst.next = headSec;
            headFirst = temp;

            temp = headSec.next;
            headSec.next = headFirst;
            headSec = temp;
        }

        //Setting Next tail to null...
        if(headFirst != null) {
            headFirst.next = null;
        }

    }

    private ListNode reverseOfList(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;
        ListNode forward = null;

        while (curr != null) {
            forward = curr.next;
            curr.next = prev;

            prev = curr;
            curr = forward;
        }
        return prev;
    }

    public ListNode midOfList(ListNode head) {

        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        return slow;
    }
}
