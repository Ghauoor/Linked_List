package Questions;

public class Reverse_A_LinkedList {
    private ListNode reverseALinkedList(ListNode head) {

        //Edge Case
        if (head == null && head.next == null) return head;

        ListNode prev = null;
        ListNode curr = head;
        ListNode forward = null;

        while (curr != null) {
            forward = curr.next;
            curr.next = prev;
            prev = curr;
            curr = forward;
        }
        return prev;

    }

    //Recursive way

    private ListNode reverse(ListNode head) {
        return reverseL(head);
    }

    private ListNode reverseL(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode smallHead = reverseL(head.next);

        head.next.next = head;

        head.next = null;

        return smallHead;

    }
}
