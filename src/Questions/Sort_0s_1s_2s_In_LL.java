package Questions;

public class Sort_0s_1s_2s_In_LL {
    public ListNode segregate(ListNode head) {
        // add your code here
        int zeroCount = 0;
        int oneCount = 0;
        int twoCount = 0;

        ListNode temp = head;

        while (temp != null) {
            if (temp.val == 0) zeroCount++;
            else if (temp.val == 1) oneCount++;
            else if (temp.val == 2) twoCount++;

            temp = temp.next;
        }

        temp = head;

        while (temp != null) {
            if (zeroCount != 0) {
                temp.val = 0;
                zeroCount--;
            } else if (oneCount != 0) {
                temp.val = 1;
                oneCount--;
            } else if (twoCount != 0) {
                temp.val = 2;
                twoCount--;
            }
            temp = temp.next;
        }

        return head;
    }
    /**
     * TC: O(N)
     * SC: O(1)
     */

}
