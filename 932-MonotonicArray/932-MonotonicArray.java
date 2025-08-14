// Last updated: 8/14/2025, 11:21:35 AM
class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean inc_mono=true;
        boolean dec_mono=true;
        for (int i=1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                dec_mono = false;
            }
            if (nums[i] < nums[i - 1]) {
                inc_mono = false;
            }
        }
        if (inc_mono || dec_mono) {
            return true;
        } else {
            return false;
        }
    }
}
