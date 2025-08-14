// Last updated: 8/14/2025, 11:22:24 AM
class Solution {
    public int pivotIndex(int[] nums) {
        int totalSum=0;
        for (int i = 0; i < nums.length; i++) {
            totalSum += nums[i];
        }
        int leftSum=0;
        for (int i = 0; i < nums.length; i++) {
            int rightSum = totalSum - leftSum - nums[i];
            if (leftSum==rightSum) {
                return i;
            }
            leftSum += nums[i];
        }
        return -1; 
    }
}
