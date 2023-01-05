package Questions;

public class Check_LL_IsCircular_Or_Not {
    public boolean linkedListCircularOrNot(ListNode head) {
        if (head == null)
            return true;

        if (head.next == null) return false;
        ListNode temp = head.next;
        while (temp == null && temp == head) {
            temp = temp.next;
        }
        return temp != null ? true : false;
    }
}
