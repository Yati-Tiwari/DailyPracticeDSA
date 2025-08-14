// Last updated: 8/14/2025, 11:16:24 AM
class Solution {
    public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {
        for(int b=k/2-1;b>=0;b--){
            int rw1=x+b;
            int rw2=x+k-3+2-b;
            for(int cm=y+k-3+2;cm>=y;cm--){
                int o=grid[rw1][cm];
                grid[rw1][cm]=grid[rw2][cm];
                grid[rw2][cm]=o;
            }
        }
        return grid;
    }
}