// Last updated: 9/10/2025, 12:40:50 PM
class Solution {
    public int minFallingPathSum(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        int[][] dp = new int[m][n];
        for (int[] a : dp) {
            Arrays.fill(a, -66666);
        }

        int res = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            res = Math.min(Minimum_Path(grid, 0, i, dp), res);
        }
        return res;
    }

    public static int Minimum_Path(int[][] grid, int cr, int cc, int[][] dp) {
        if (cr == grid.length - 1) {
            return grid[cr][cc];
        }

        if (dp[cr][cc] != -66666) {
            return dp[cr][cc];
        }

        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < grid[0].length; i++) {
            if (i == cc) {
                continue;
                } // skip same column
            ans = Math.min(ans, Minimum_Path(grid, cr + 1, i, dp));
        }

        dp[cr][cc] = grid[cr][cc] + ans;
        return dp[cr][cc];
    }
}