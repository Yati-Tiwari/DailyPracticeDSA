// Last updated: 8/14/2025, 11:17:18 AM
class Solution {
    public boolean canSortArray(int[] nums) {
        int previous_Max=Integer.MIN_VALUE;
        int i=0;
        int n=nums.length;
        while (i < n) {
            int j=i + 1;
            int count=Integer.bitCount(nums[i]);
            int currentMin=nums[i];
            int currentMax = nums[i];
            while (j < n && Integer.bitCount(nums[j]) == count) {
                currentMin = Math.min(currentMin, nums[j]);
                currentMax = Math.max(currentMax, nums[j]);
                j++;
            }
            if (previous_Max > currentMin) {
                return false;
            }
            previous_Max = currentMax;
            i=j;
        }
        return true;
    }
}