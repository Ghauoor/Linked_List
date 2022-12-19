package Questions;

public class Merge_Two_Sorted_LL {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummyHead = new ListNode();

        ListNode tail = dummyHead;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                tail.next = list1;
                list1 = list1.next;
            } else {
                tail.next = list2;
                list2 = list2.next;
            }
            tail = tail.next;
        }

        tail.next = (list1 != null) ? list1 : list2;
        return dummyHead.next;


    }

    /**
     * This is Correct ans just comment it!

     Node sortedMerge(Node head1, Node head2) {

     Node ansHead = new Node(0);
     Node head = ansHead;

     while (head1 != null && head2 != null) {
     if (head1.data < head2.data) {
     head.next = head1;
     head1 = head1.next;
     head = head.next;
     } else {
     head.next = head2;
     head2 = head2.next;
     head = head.next;
     }
     }

     while (head1 != null) {
     head.next = head1;
     head1 = head1.next;
     head = head.next;
     }

     while (head2 != null) {
     head.next = head2;
     head2 = head2.next;
     head = head.next;
     }

     return ansHead.next;
     }

     */
}

