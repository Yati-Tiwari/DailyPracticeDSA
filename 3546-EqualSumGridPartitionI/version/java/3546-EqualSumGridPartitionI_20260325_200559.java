// Last updated: 3/25/2026, 8:05:59 PM
1class Solution {
2    public boolean canPartitionGrid(int[][] grid) {
3        int rows = grid.length;
4        int cols = grid[0].length;
5        long total = 0;
6        long[] rowSums = new long[rows];
7        long[] colSums = new long[cols];
8        // Compute sums
9        for (int i = 0; i < rows; i++) {
10            for (int j = 0; j < cols; j++) {
11                int val = grid[i][j];
12                total += val;
13                rowSums[i] += val;
14                colSums[j] += val;
15            }
16        }
17        // Horizontal cut
18        long topSum = 0;
19        for (int i = 0; i < rows - 1; i++) {
20            topSum += rowSums[i];
21            if (topSum * 2 == total) return true;
22        }
23        // Vertical cut
24        long leftSum = 0;
25        for (int j = 0; j < cols - 1; j++) {
26            leftSum += colSums[j];
27            if (leftSum * 2 == total) return true;
28        }
29
30        return false;
31    }
32}