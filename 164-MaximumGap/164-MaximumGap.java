// Last updated: 8/14/2025, 11:25:36 AM
class Solution {
    public int maximumGap(int[] nums) {
        if (nums.length < 2) 
        {
            return 0;
        }
        Arrays.sort(nums); 
        int maxGap = 0;
        for (int i = 1; i < nums.length; i++) {
            maxGap = Math.max(maxGap, nums[i] - nums[i - 1]);
        }
        return maxGap;
    }
}
