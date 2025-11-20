// Last updated: 11/20/2025, 2:48:47 PM
class Solution {
    public int minimumArea(int[][] grid) {
        int rows=grid.length;
        int colm=grid[0].length;
        int minRow=rows, minCol=colm;
        int maxCol=-1,  maxRow=-1;
        for (int i=0; i < rows; i++) {
            for (int j=0; j < colm; j++) {
                if (grid[i][j]==1) {
                    minRow=Math.min(minRow, i);
                    maxRow=Math.max(maxRow, i);
                    minCol=Math.min(minCol, j);
                    maxCol=Math.max(maxCol, j);
                }
            }
        }
        if(maxRow==-1){
                return -1;
         }
         int ans= (maxRow-minRow +1 )*(maxCol-minCol+1);
         return ans;

    }
}