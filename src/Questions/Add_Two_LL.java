package Questions;

public class Add_Two_LL {
    public ListNode addTwoNumbers(ListNode first, ListNode second) {
        ListNode ans = add(first, second);
        return ans;
    }

    void insertAtTail(ListNode head, ListNode tail, int val) {
        ListNode temp = new ListNode(val);
        if (head == null) {
            head = temp;
            tail = temp;
        } else {
            tail.next = temp;
            tail = temp;
        }
    }

    private ListNode add(ListNode first, ListNode second) {
        int carry = 0;
        ListNode ansHead = new ListNode(0);
        ListNode ansTail = ansHead;

        while (first != null && second != null) {
            int sum = carry + first.val + second.val;

            int digit = sum % 10;

            insertAtTail(ansHead, ansTail, digit);
            carry = sum / 10;

            ansTail = ansTail.next;
            first = first.next;
            second = second.next;
        }

        while (first != null) {
            int sum = carry + first.val;
            int digit = sum % 10;

            insertAtTail(ansHead, ansTail, digit);
            carry = sum / 10;

            ansTail = ansTail.next;
            first = first.next;
        }

        while (second != null) {
            int sum = carry + second.val;
            int digit = sum % 10;

            insertAtTail(ansHead, ansTail, digit);
            carry = sum / 10;

            ansTail = ansTail.next;
            second = second.next;

        }

        while (carry != 0) {
            int sum = carry;
            int digit = sum % 10;

            insertAtTail(ansHead, ansTail, digit);
            carry = sum / 10;

            ansTail = ansTail.next;
        }

        return ansHead.next;

    }

}
