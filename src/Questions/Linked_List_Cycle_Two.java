package Questions;

//LeetCode Linked List Cycle II

public class Linked_List_Cycle_Two {

    public ListNode cycleStartNode(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        int len = 0;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (slow == fast) {
                len = lenOfCycle(slow);
                break;
            }
        }
        ListNode f = head;
        ListNode s = head;

        while (len > 0) {
            s = s.next;
            len--;
        }

        while (f != s) {
            f = f.next;
            s = s.next;
        }

        return s;
    }


    public int lenOfCycle(ListNode head) {

        ListNode fast = head;
        ListNode slow = head;
        int len = 0;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (slow == fast) {
                ListNode temp = slow;

                do {
                    temp = temp.next;
                    len++;
                } while (temp != slow);

                return len;
            }
        }

        return 0;
    }
}
