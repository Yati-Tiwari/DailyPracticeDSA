// Last updated: 8/14/2025, 11:19:19 AM
class Solution {
    public int maxAscendingSum(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int maxSum = nums[0];
        int currentSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                currentSum += nums[i];
            } else {
                maxSum = Math.max(maxSum, currentSum);
                currentSum = nums[i];
            }
        }

        maxSum = Math.max(maxSum, currentSum);

        return maxSum;
    }
}
