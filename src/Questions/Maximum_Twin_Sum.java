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
}
