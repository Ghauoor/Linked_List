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


    //Another Approach in which Data Replacement is Not Allow 
    public ListNode segregateList(ListNode head) {
        ListNode zeroDummy = new ListNode(-1);
        ListNode oneDummy = new ListNode(-1);
        ListNode twoDummy = new ListNode(-1);

        ListNode zeroTail = zeroDummy;
        ListNode oneTail = oneDummy;
        ListNode twoTail = twoDummy;

        ListNode curr = head;
        while (curr != null) {
            if (curr.val == 0) {
                zeroTail.next = curr;
                zeroTail = curr;
            } else if (curr.val == 1) {
                oneTail.next = curr;
                oneTail = curr;
            } else {
                twoTail.next = curr;
                twoTail = curr;
            }
            curr = curr.next;
        }

        zeroTail.next = (oneDummy.next != null) ? oneDummy.next : twoDummy.next;
        oneTail.next = twoDummy.next;
        twoTail.next = null;

        return zeroDummy.next;
    }


    /**
     * In this implementation,
     * we use 3 dummy nodes (zeroDummy, oneDummy, twoDummy) to represent the three sublists of 0s, 1s, and 2s.
     * We also use 3 pointers (zeroTail, oneTail, twoTail) to keep track of the tail of each sublist.
     *
     * In the while loop,
     * we iterate through the original linked list and move each node to the appropriate sublist based on its value.
     *
     * After the while loop,
     * we merge the sublists in the correct order and return the head of the merged list (which is the next node of zeroDummy).
     *
     * Note that this solution is given in the context of the class you provided,
     * so it is possible that it will not run as is in your environment.
     *
     *  TC: O(N)
     *  SC: O(1)
     *
     * */

}
