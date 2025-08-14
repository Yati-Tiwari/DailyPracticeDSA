// Last updated: 8/14/2025, 11:21:25 AM
class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        return atMost(nums, goal) - atMost(nums, goal - 1);
    }

    private int atMost(int[] nums, int S) {
        if (S < 0) return 0;
        int count = 0, sum = 0, left = 0;

        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];
            while (sum > S) {
                sum -= nums[left];
                left++;
            }
            count += right - left + 1;
        }

        return count;
    }
}
