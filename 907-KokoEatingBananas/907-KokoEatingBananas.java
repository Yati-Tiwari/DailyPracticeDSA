// Last updated: 8/14/2025, 11:21:41 AM
public class Solution {
    public int minEatingSpeed(int[] piles, int H) {
        int left = 1;
        int right = getMaxPile(piles);
        int result = right;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (canFinish(piles, H, mid)) {
                result = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return result;
    }

    private boolean canFinish(int[] piles, int H, int speed) {
        int hours = 0;
        for (int pile : piles) {
            hours += (pile + speed - 1) / speed;
            if (hours > H) 
            {
                return false;
            }
        }
        return true;
    }

    private int getMaxPile(int[] piles) {
        int max = 0;
        for (int pile : piles) {
            max = Math.max(max, pile);
        }
        return max;
    }
}
