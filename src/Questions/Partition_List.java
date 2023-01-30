package Questions;

public class Partition_List {
    //https://leetcode.com/problems/partition-list/description/
    public ListNode partitionList(ListNode head, int x) {
        ListNode small = new ListNode(0);
        ListNode higher = new ListNode(0);

        ListNode smallHead = small;
        ListNode higherHead = higher;

        while (head != null) {
            if (head.val < x) {
                //small List
                smallHead.next = head;
                smallHead = smallHead.next;
            } else {
                //higher list
                higherHead.next = head;
                higherHead = higherHead.next;
            }

            //Move the head for traverse
            head = head.next;
        }

        higherHead.next = null;
        smallHead.next = higher.next;

        return small.next;
    }


}
