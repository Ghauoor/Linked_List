package Questions;

public class Add_One_To_LL {
    private ListNode addOne(ListNode head) {
        ListNode newHead = reverse(head);
        ListNode curr = newHead;
        ListNode currOne = newHead;
        ListNode prev = null;

        int carry = 0;

        while (curr != null) {
            int sum = 0;
            if (prev == null) { // prev == null means first time sum operation is performed
                sum = 1 + curr.val;
            } else {
                sum = carry + curr.val;

                carry = sum / 10;

                curr.val = sum % 10;

                //Now Move the Pointers
                prev = curr;
                curr = curr.next;
            }

        }

        //Handle the Carry case
        if (carry == 1) {
            ListNode tempNode = new ListNode(1);
            prev.next = tempNode;
        }

        return reverse(currOne);
    }

    private ListNode reverse(ListNode head) {
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
