// Last updated: 3/21/2026, 3:22:09 PM
1class Solution {
2    public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {
3        for(int b=k/2-1;b>=0;b--){
4            int rw1=x+b;
5            int rw2=x+k-3+2-b;
6            for(int cm=y+k-3+2;cm>=y;cm--){
7                int o=grid[rw1][cm];
8                grid[rw1][cm]=grid[rw2][cm];
9                grid[rw2][cm]=o;
10            }
11        }
12        return grid;
13    }
14}