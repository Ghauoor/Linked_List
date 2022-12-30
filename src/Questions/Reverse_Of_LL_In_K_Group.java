package Questions;

public class Reverse_Of_LL_In_K_Group {

    /**
     * Valid Solution on Coding Ninja
     * Some Test Cases Fail at Leet Code
     */
    public static ListNode kReverse(ListNode head, int k) {
        if (head == null) return null;

        ListNode forward = null;
        ListNode prev = null;
        ListNode curr = head;

        int count = 0;

        while (curr != null && count < k) {
            forward = curr.next;
            curr.next = prev;
            prev = curr;
            curr = forward;

            count++;
        }
        if (forward != null) {
            head.next = kReverse(forward, k);
        }

        return prev;

    }
}

