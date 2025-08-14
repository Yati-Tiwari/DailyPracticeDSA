// Last updated: 8/14/2025, 11:19:32 AM
class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int maxSum = 0;
        int minSum = 0;
        int  maxSoFar = 0;
        int minSoFar = 0;
        
        for (int i = 0; i < nums.length; i++) {
            maxSoFar = Math.max(nums[i], maxSoFar + nums[i]);
            minSoFar = Math.min(nums[i], minSoFar + nums[i]);
            maxSum = Math.max(maxSum, maxSoFar);
            minSum = Math.min(minSum, minSoFar);
        }
        
        return Math.max(maxSum, Math.abs(minSum));
    }
}
