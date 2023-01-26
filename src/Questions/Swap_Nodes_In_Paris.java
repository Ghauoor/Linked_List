package Questions;


public class Swap_Nodes_In_Paris {
    public ListNode swapPairs(ListNode head) {
        ListNode dummyNode = new ListNode(0);
        dummyNode.next = head;

        ListNode curr = dummyNode;

        while (curr.next != null && curr.next.next != null) {
            ListNode a = curr.next;
            ListNode b = curr.next.next;

            //swap
            a.next = b.next;
            curr.next = b;
            curr.next.next = a;

            //move to next set
            curr = curr.next.next;
        }

        return dummyNode.next;
    }
}
