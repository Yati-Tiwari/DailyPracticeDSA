// Last updated: 8/14/2025, 11:22:20 AM
class Solution {
    public int deleteAndEarn(int[] nums) {
        int max=0;
        for (int i=0; i < nums.length; i++) {
            max = Math.max(max, nums[i]);
        }
        int[] points=new int[max + 1];
        for (int i = 0; i < nums.length; i++) {
            points[nums[i]] += nums[i];
        }
        int[] dp=new int[max + 1];
        dp[0]=0;
        dp[1]=points[1];
        for (int i=2; i <= max; i++) {
            dp[i]=Math.max(dp[i - 1], dp[i - 2] + points[i]);
        }
        return dp[max];
    }
}
