// Last updated: 12/10/2025, 8:06:21 PM
1class Solution {
2    public int getMoneyAmount(int n) {
3        int[][] dp=new int[n + 2][n + 2]; 
4        for (int len=2; len <= n; len++) {
5            for (int start=1; start <= n-len + 1; start++) {
6                int end=start + len - 1;
7                dp[start][end]=Integer.MAX_VALUE;
8                for (int k=start; k < end; k++) {
9                    int cost=k + Math.max(dp[start][k-1], dp[k + 1][end]);
10                    dp[start][end] = Math.min(dp[start][end], cost);
11                }
12            }
13        }
14        return dp[1][n];
15    }
16}
17