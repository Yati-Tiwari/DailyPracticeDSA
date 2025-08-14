// Last updated: 8/14/2025, 11:16:46 AM
class Solution {
    public int countPartitions(int[] nums) {
        int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }
        int leftSum = 0;
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            leftSum += nums[i]; 
            int rightSum = totalSum - leftSum;
            if ((leftSum - rightSum) % 2 == 0) {
                count++;
            }
        }

        return count; 
    }
}
