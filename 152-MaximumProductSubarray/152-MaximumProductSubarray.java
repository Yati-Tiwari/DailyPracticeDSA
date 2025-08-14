// Last updated: 8/14/2025, 11:25:43 AM
class Solution {
    public int maxProduct(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int currMax = nums[0];
        int currMin = nums[0];
        int ans = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int tempMax = currMax;  
            currMax=Math.max(nums[i],Math.max(currMax*nums[i],currMin*nums[i]));
            currMin=Math.min(nums[i],Math.min(tempMax*nums[i],currMin*nums[i]));
            ans=Math.max(ans, currMax);
        }
        return ans;
    }
}
