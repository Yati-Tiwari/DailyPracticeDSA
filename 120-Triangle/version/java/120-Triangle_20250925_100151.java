// Last updated: 9/25/2025, 10:01:51 AM
public class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n=triangle.size();
        int[] dp=new int[n];
        for (int i = 0; i < n;i++) {
            dp[i] = triangle.get(n - 1).get(i);
        }
        for (int row=n - 2;row>=0;row--) {
            for (int col = 0; col <= row; col++) {
                int current = triangle.get(row).get(col);
                int minBelow = Math.min(dp[col],dp[col + 1]);
                dp[col] = current + minBelow;
            }
        }
        return dp[0];
    }
}
