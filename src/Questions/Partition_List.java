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

    //https://practice.geeksforgeeks.org/problems/partition-a-linked-list-around-a-given-value/1?utm_source=gfg&utm_medium=article&utm_campaign=bottom_sticky_on_article
    public ListNode partition(ListNode node, int x) {
        ListNode equal = new ListNode(0);
        ListNode small = new ListNode(0);
        ListNode higher = new ListNode(0);

        ListNode equalHead = equal;
        ListNode smallHead = small;
        ListNode higherHead = higher;

        ListNode curr = node;

        while (curr != null) {
            if (curr.val == x) {
                //equal list
                equalHead.next = curr;
                equalHead = equalHead.next;

            } else if (curr.val < x) {
                //small list
                smallHead.next = curr;
                smallHead = smallHead.next;

            } else {
                //higher list
                higherHead.next = curr;
                higherHead = higherHead.next;
            }

            curr = curr.next;
        }

        //Avoid cycle
        higherHead.next = null;

        //Attach lists
        equalHead.next = higher.next;
        smallHead.next = equal.next;

        return small.next;

    }


}
