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

    //Without using Length Func
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                while (slow != head) {
                    slow = slow.next;
                    head = head.next;
                }
                return slow;
            }
        }
        return null;
    }
}
