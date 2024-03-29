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

    //Without insert method
    public ListNode addTwoNumbersAnotherApproach(ListNode first, ListNode second) {
        ListNode answer = addTwoLL(first, second);

        return answer;
    }

    private ListNode addTwoLL(ListNode first, ListNode second) {
        ListNode ansHead = new ListNode(0);
        ListNode ansTail = ansHead;

        int carry = 0;

        while (first != null || second != null || carry != 0) {
            int valOne = first != null ? first.val : 0;
            int valTwo = second != null ? second.val : 0;

            int sum = carry + valOne + valTwo;

            int dig = sum % 10;

            ansTail.next = new ListNode(dig);

            ansTail = ansTail.next;

            carry = sum / 10;

            if (first != null) {
                first = first.next;
            }

            if (second != null) {
                second = second.next;
            }
        }

        return ansHead.next;
    }

    // This method able to clear GFG practice Question Test case

    static ListNode reverseList(ListNode head) {
        if (head == null || head.next == null)
            return head;

        ListNode newhead = null;
        ListNode temp = head;

        while (temp != null) {
            head = head.next;
            temp.next = newhead;
            newhead = temp;
            temp = head;
        }

        return newhead;
    }

    private ListNode addTwoLists(ListNode first, ListNode second) {
        first = reverseList(first);
        second = reverseList(second);

        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;
        int carry = 0;

        while (first != null || second != null || carry == 1) {
            int sum = 0;

            if (first != null) {
                sum += first.val;
                first = first.next;
            }
            if (second != null) {
                sum += second.val;
                second = second.next;
            }
            sum += carry;
            carry = sum / 10;

            ListNode newnode = new ListNode(sum % 10);
            temp.next = newnode;
            temp = temp.next;
        }

        return reverseList(dummy.next);
    }


}
