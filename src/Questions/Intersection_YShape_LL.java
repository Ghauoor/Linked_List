package Questions;

public class Intersection_YShape_LL {
    private int lenOfList(ListNode head) {
        int len = 0;
        ListNode temp = head;
        while (temp != null) {
            len++;
            temp = temp.next;
        }

        return len;
    }

    public int intersectPoint(ListNode headA, ListNode headB) {
        //length of list
        int lenA = lenOfList(headA);
        int lenB = lenOfList(headB);

        int diff = Math.abs(lenA - lenB);

        //iterate
        ListNode tempA = headA;
        ListNode tempB = headB;

        //Setting pointers to skip extra list
        if (lenA > lenB) {
            while (diff-- > 0) {
                tempA = tempA.next;
            }
        } else {
            while (diff-- > 0) {
                tempB = tempB.next;
            }
        }

        //Check for equality
        while (tempA != tempB) {
            tempA = tempA.next;
            tempB = tempB.next;

            //One of pointer meet null means no intersection
            if (tempA == null || tempB == null) {
                return -1;
            }
        }
        //Can return any one of pointer
        return tempA.val;
    }
}
