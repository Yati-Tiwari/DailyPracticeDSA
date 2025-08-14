// Last updated: 8/14/2025, 11:23:55 AM
class Solution {
    public int arrangeCoins(int n) {
        long low = 0;
        long high = n;     
        while (low <= high) {
            long mid = low + (high - low) / 2;
            long coinsUsed = mid * (mid + 1) / 2;          
            if (coinsUsed == n) {
                return (int) mid;
            } else if (coinsUsed < n) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }       
        return (int) high;
    }
}
