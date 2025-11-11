// Last updated: 11/11/2025, 6:18:27 PM
class Solution {
    public int findMaxForm(String[] strs, int m, int n) {
        int[][] dp = new int[m+1][n+1];
        for (int k=0; k < strs.length;k++) {
            String s=strs[k];
            int zeroes=0; 
            int ones=0;
            for (int idx=0; idx < s.length(); idx++) {
                if (s.charAt(idx)=='0') {
                    zeroes++;
                }
                else {
                    ones++;
                }
            }
            for (int i=m; i>=zeroes; i--) {
                for (int j=n; j >=ones; j--) {
                    dp[i][j] = Math.max(dp[i][j], dp[i-zeroes][j - ones]+1);
                }
            }
        }
        return dp[m][n];
    }
}
