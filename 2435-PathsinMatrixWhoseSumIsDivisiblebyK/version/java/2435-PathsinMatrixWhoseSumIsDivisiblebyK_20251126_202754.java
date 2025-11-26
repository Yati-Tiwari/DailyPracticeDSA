// Last updated: 11/26/2025, 8:27:54 PM
1class Solution {
2    public int numberOfPaths(int[][] grid, int k) {
3        int mod=1000000007;
4        int m=grid.length;
5        int n=grid[0].length;
6        int[][][] dp=new int[m][n][k];
7        dp[0][0][grid[0][0] % k] = 1;
8        for (int i=0;i<m;i++) {
9            for (int j=0;j<n;j++) {
10                for (int r=0;r<k;r++) {
11                    if (dp[i][j][r]==0) {
12                        continue;
13                    }
14                    if ((i+1) < m) {
15                        int nr = (r + grid[i+1][j]) % k;
16                        dp[i+1][j][nr] = (dp[i+1][j][nr] + dp[i][j][r]) % mod;
17                    }
18                    if ((j+1) < n) {
19                        int nr = (r+grid[i][j+1]) % k;
20                        dp[i][j+1][nr]=(dp[i][j+1][nr] + dp[i][j][r]) % mod;
21                    }
22                }
23
24            }
25        }
26        int result=dp[m-1][n-1][0];
27        return result;
28    }
29}
30