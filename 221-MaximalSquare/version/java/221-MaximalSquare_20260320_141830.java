// Last updated: 3/20/2026, 2:18:30 PM
1class Solution {
2    public int maximalSquare(char[][] matrix) {
3        int m=matrix.length;
4        int n=matrix[0].length;
5        int[][] dp = new int[m][n];
6        for (int i = 0; i < m; i++) {
7            for (int j = 0; j < n; j++) {
8                dp[i][j] = -1;
9            }
10        }
11        for (int i = 0; i < m; i++) {
12            for (int j = 0; j < n; j++) {
13                count(matrix, i, j, dp);
14            }
15        }
16        int max = 0;
17        for (int i = 0; i < m; i++) {
18            for (int j = 0; j < n; j++) {
19                max = Math.max(max, dp[i][j]);
20            }
21        }
22
23        return max * max; // area
24    }
25
26    public int count(char[][] matrix, int i, int j, int[][] dp) {
27        if (i < 0 || j < 0){
28            return 0;
29        }
30        if (matrix[i][j] == '0'){
31            return 0;
32        }
33        if (dp[i][j] != -1){
34            return dp[i][j];
35        }
36        int x = count(matrix, i - 1, j - 1, dp);
37        int y = count(matrix, i - 1, j, dp);
38        int z = count(matrix, i, j - 1, dp);
39        dp[i][j] = 1 + Math.min(x, Math.min(y,z));
40        return dp[i][j];
41    }
42}
43