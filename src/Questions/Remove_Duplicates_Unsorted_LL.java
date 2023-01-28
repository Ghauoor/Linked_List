package Questions;

import java.util.HashSet;

/**
 * This is not the Optimal Approach
 * This is able to clear 403 test cases out of 416
 * <p>
 * >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
 * <p>
 * Optimal Approach is By Using HashMap or By Sorting the List Using Merge Sort
 */
public class Remove_Duplicates_Unsorted_LL {
    public ListNode removeDuplicates(ListNode head) {
        ListNode curr = head;
        ListNode temp = null;

        while (curr != null && curr.next != null) {
            temp = curr;

            while (temp.next != null) {
                if (curr.val == temp.next.val) {
                    temp.next = temp.next.next;
                } else {
                    temp = temp.next;
                }
            }

            curr = curr.next;
        }
        return head;
    }

    /**
     * HashSet Approach
     */

    public ListNode removeDuplicate(ListNode head) {

        HashSet<Integer> hs = new HashSet<>();
        ListNode curr = head;
        ListNode prev = null;

        while (curr != null) {
            int value = curr.val;

            if (hs.contains(value)) {
                prev.next = curr.next;
            } else {
                hs.add(value);
                prev = curr;
            }

            curr = curr.next;
        }

        return head;

    }

}
