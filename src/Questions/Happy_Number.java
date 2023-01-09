package Questions;

/**
 * This is not a exact LL question but intuition is same as Linked List Cycle
 *
 */
public class Happy_Number {
    public boolean isHappy(int n) {
        int fast = n;
        int slow = n;

        do {
            slow = findSQR(slow);
            fast = findSQR(findSQR(fast));
        } while (fast != slow);

        if (slow == 1) return true;

        return false;
    }

    private int findSQR(int num) {
        int ans = 0;

        while (num > 0) {
            int rem = num % 10;
            ans += rem * rem;
            num /= 10;
        }

        return ans;
    }
}
