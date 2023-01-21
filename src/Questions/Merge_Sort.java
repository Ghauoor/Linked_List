package Questions;

public class Merge_Sort {
    static Node findMid(Node head) {
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    static Node merge(Node left, Node right) {
        if (left == null && right != null) return right;
        if (right == null && left != null) return left;
        Node ans = new Node(-1);
        Node temp = ans;
        while (left != null && right != null) {
            if (left.val < right.val) {
                temp.next = left;
                temp = left;
                left = left.next;
            } else {
                temp.next = right;
                temp = right;
                right = right.next;
            }
        }
        while (left != null) {
            temp.next = left;
            temp = left;
            left = left.next;
        }
        while (right != null) {
            temp.next = right;
            temp = right;
            right = right.next;
        }
        ans = ans.next;
        return ans;
    }

    static Node mergeSort(Node head) {
        if (head == null || head.next == null) return head;
        Node mid = findMid(head);
        Node left = head;
        Node right = mid.next;
        mid.next = null;

        left = mergeSort(left);
        right = mergeSort(right);
        Node result = merge(left, right);
        return result;
    }

    /**
     * Valid solution for Leetcode
     */

    public ListNode mid(ListNode head) {
        ListNode midPrev = null;
        while (head != null && head.next != null) {
            midPrev = (midPrev == null) ? head : midPrev.next;
            head = head.next.next;
        }
        ListNode mid = midPrev.next;
        midPrev.next = null;
        return mid;
    }

    public ListNode mergeLL(ListNode left, ListNode right) {

        ListNode dummyHead = new ListNode();
        ListNode tail = dummyHead;

        while (left != null && right != null) {
            if (left.val < right.val) {
                tail.next = left;

                left = left.next;
                tail = tail.next;

            } else {
                tail.next = right;

                right = right.next;
                tail = tail.next;
            }
        }

        tail.next = (left != null) ? left : right;
        return dummyHead.next;
    }

    public ListNode sortLinkedList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode mid = mid(head);

        ListNode left = sortLinkedList(head);
        ListNode right = sortLinkedList(mid);

        return mergeLL(left, right);

    }
}

