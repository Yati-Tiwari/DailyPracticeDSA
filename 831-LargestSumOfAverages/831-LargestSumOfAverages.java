// Last updated: 8/14/2025, 11:21:54 AM
class Solution {
    public double largestSumOfAverages(int[] nums, int k) {
        int n = nums.length;
        double[] prefix = new double[n + 1];
        for (int i = 0; i < n; i++) {
            prefix[i + 1] = prefix[i] + nums[i];
        }
        double[][] dp = new double[n + 1][k + 1];
        for (int i = 1; i <= n; i++) {
            dp[i][1] = prefix[i] / i;
        }
        for (int pj=2; pj <= k; pj++) {
            for (int i = 1; i <= n; i++) {
                for (int j = 0; j < i; j++) {
                    dp[i][pj]=Math.max(dp[i][pj],dp[j][pj-1]+(prefix[i]-prefix[j])/ (i-j));
                }
            }
        }
        return dp[n][k];
    }
}
