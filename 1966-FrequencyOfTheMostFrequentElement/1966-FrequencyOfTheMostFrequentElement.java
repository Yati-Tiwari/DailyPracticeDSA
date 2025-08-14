// Last updated: 8/14/2025, 11:19:17 AM
class Solution {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        int left=0;
        long total=0;
        int max_Frequency=0;
        for (int right=0; right < nums.length; right++) {
            total += nums[right];
            while ((long) nums[right] * (right-left+1) - total > k) {
                total=total-nums[left];
                left++;
            }
            max_Frequency=Math.max(max_Frequency, right - left + 1);
        }
        return max_Frequency;
    }
}