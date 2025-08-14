// Last updated: 8/14/2025, 11:17:52 AM
class Solution {
    public int minimizeSum(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int opt1=nums[n-1] - nums[2];
        int opt2=nums[n-2] - nums[1];
        int opt3=nums[n-3] - nums[0];
        int ans= Math.min(opt1, Math.min(opt2, opt3));
        return ans;
    }
}
