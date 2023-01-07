package Questions;

public class Length_Of_Cycle {
    public int lengthOfCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;


        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow) {
                //Calculate the Length

                int length = 0;
                ListNode temp = slow;
                do {
                    temp = temp.next;
                    length++;

                } while (temp != slow);

                return length;
            }
        }
        return -1;
    }
}
