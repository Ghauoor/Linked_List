package Questions;

public class Is_Palindrome_LL {
    public boolean isPalindrome(ListNode head) {
        if (head == null) return true;

        //get the mid

        ListNode mid = midOfList(head);

        ListNode reverse = reverseOfList(mid);

        ListNode curr = head;

        while (reverse != null) {
            if (curr.val != reverse.val) return false;

            curr = curr.next;

            reverse = reverse.next;
        }

        return true;
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
}
