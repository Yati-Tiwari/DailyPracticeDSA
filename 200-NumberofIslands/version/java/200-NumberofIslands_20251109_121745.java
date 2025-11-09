// Last updated: 11/9/2025, 12:17:45 PM
class Solution {
    public int numIslands(char[][] grid) {
        int m=grid.length;       // total rows
        int n=grid[0].length;    // total columns
        int count=0;             // islands count rakhega
        
        // Agar grid empty ya null hai toh 0 islands
        if (grid==null || grid.length==0) {
            return 0;
        }
        // pura grid traverse karo
        for (int i=0; i < m; i++) {
            for (int j=0; j < n; j++) {
                // agar current cell land hai ('1')
                if (grid[i][j]== '1') {
                    count++;             // ek naya island mila
                    dfs(grid,i,j);     // us island ko puri tarah explore karo (DFS se)
                }
            }
        }
        return count;   // final islands ka number
    }
    private void dfs(char[][] grid, int i, int j) {
        int m=grid.length;     // rows
        int n=grid[0].length;  // cols
        
        // base condition → agar out of boundary ya water ('0') hai toh return
        if (i<0 || j<0 || i >= m || j >= n || grid[i][j]== '0') {
            return;
        }
        grid[i][j] = '0';   // current land ko "visited" mark karo (ya sink kar do)
        // 4 directions me explore karo (up, down, left, right)
        dfs(grid, i+1, j);   // down
        dfs(grid, i-1, j);   // up
        dfs(grid, i, j+1);   // right
        dfs(grid, i, j-1);   // left
    }
}
