package Questions;

import java.util.ArrayList;
import java.util.List;
//https://leetcode.com/problems/maximum-twin-sum-of-a-linked-list/


public class Maximum_Twin_Sum {
    public int pairSum(ListNode head) {
        List<Integer> list = new ArrayList<>();
        ListNode curr = head;
        while (curr != null) {
            list.add(curr.val);
            curr = curr.next;
        }
        int res = 0;
        int i = 0;
        int j = list.size() - 1;

        while (i < j) {
            res = Math.max(res, list.get(i) + list.get(j));
            i++;
            j--;
        }
        return res;
    }

    private ListNode findMid(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    private ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public int pairsSum(ListNode head) {
        ListNode mid = findMid(head);
        ListNode prev = reverse(mid);
        ListNode curr = head;

        int result = 0;

        while (prev != null) {
            result = Math.max(result, curr.val + prev.val);
            curr = curr.next;
            prev = prev.next;
        }
        return result;
    }
}
