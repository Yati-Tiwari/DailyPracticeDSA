// Last updated: 12/20/2025, 12:34:43 PM
1class Solution {
2  public boolean predictTheWinner(int[] nums) {
3    int n = nums.length;
4    int[][] dp = new int[n][n];
5
6    for (int i = 0; i < n; ++i)
7      dp[i][i] = nums[i];
8
9    for (int d = 1; d < n; ++d)
10      for (int i = 0; i + d < n; ++i) {
11        int j = i + d;
12        dp[i][j] = Math.max(nums[i] - dp[i + 1][j], nums[j] - dp[i][j - 1]);
13      }
14
15    return dp[0][n - 1] >= 0;
16  }
17}