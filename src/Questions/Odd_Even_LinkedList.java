package Questions;

public class Odd_Even_LinkedList {
    public ListNode oddEvenList(ListNode head) {
        if (head == null)
            return head;

        ListNode odd = head;
        ListNode even = head.next;

        //Maintain Even head

        ListNode evenHead = even;

        while (even != null && even.next != null) {
            //Change pointer for odd list
            odd.next = odd.next.next;
            odd = odd.next;

            //Change pointer for even list
            even.next = even.next.next;
            even = even.next;
        }

        //Assign even list to end of odd list

        odd.next = evenHead;

        return head;

    }
}
