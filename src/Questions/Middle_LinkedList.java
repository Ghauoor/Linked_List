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
}
