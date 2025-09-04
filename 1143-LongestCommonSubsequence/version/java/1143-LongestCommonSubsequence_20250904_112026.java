// Last updated: 9/4/2025, 11:20:26 AM
class Solution {
    public int maxUncrossedLines(int[] s1, int[] s2) {
        int[][] dp=new int[s1.length+1][s2.length+1];
        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                int ans = 0;
                if (s1[i - 1] == s2[j - 1]) {
                    ans = dp[i - 1][j - 1] + 1;
                } else {
                    int f = dp[i - 1][j];
                    int s = dp[i][j - 1];
                    ans = Math.max(f, s);
                }
                dp[i][j] = ans;
            }
        }
        return dp[s1.length][s2.length];
    }
}