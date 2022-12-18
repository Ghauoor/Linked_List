package Questions;

public class RemoveDuplicates {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode node = head;

        while (node != null) {

            if (node.next == null) break;

            if (node.val == node.next.val) {
                node.next = node.next.next;
            } else {
                node = node.next;
            }
        }
        return head;
    }

    public ListNode deleteDuplicate(ListNode node) {
        ListNode head = node;

        if (node == null) {
            return node;
        }

        while(node.next !=  null) {
            if(node.val == node.next.val) {
                node.next = node.next.next;
            } else {
                node = node.next;
            }
        }

        return head;
    }
}
