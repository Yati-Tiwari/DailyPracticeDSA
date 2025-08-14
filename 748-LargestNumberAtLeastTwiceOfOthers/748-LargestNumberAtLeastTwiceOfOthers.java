// Last updated: 8/14/2025, 11:22:14 AM
class Solution {
    public int dominantIndex(int[] nums) {
        int Max=-1;
        int Idx=-1;
        for (int i=0; i < nums.length; i++) {
            if (nums[i] > Max) {
                Max=nums[i];
                Idx=i;
            }
        }
        for (int i=0; i < nums.length; i++) {
            if (i != Idx && Max < 2 * nums[i]) {
                return -1;
            }
        }
        return Idx;
    }
}
