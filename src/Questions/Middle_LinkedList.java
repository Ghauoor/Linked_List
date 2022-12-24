package Questions;

public class Middle_LinkedList {
    public int middleOfLL(ListNode head) {
        int len = getLength(head);
        int ans = (len / 2);

        int count = 0;
        ListNode temp = head;

        while (count < ans) {
            temp = temp.next;
            count++;
        }
        return temp.val;
    }

    private int getLength(ListNode head) {
        int len = 0;

        while (head != null) {

            len++;
            head = head.next;
        }

        return len;
    }

    //Fast and Slow Pointer Approach

    public int getMiddle(ListNode head) {
        return middle(head);
    }

    private int middle(ListNode head) {
        if (head == null || head.next == null)
            return head.val;

        if (head.next.next == null) return head.next.val;

        ListNode fast = head.next;
        ListNode slow = head;

        while (fast != null) {
            fast = fast.next;

            if (fast != null) {
                fast = fast.next;
            }

            slow = slow.next;
        }
        return slow.val;
    }

}
