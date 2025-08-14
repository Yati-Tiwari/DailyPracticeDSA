// Last updated: 8/14/2025, 11:26:56 AM
class Solution {
    public int totalNQueens(int n) {
        return countSolutions(new char[n][n], 0, n);
    }
    
    private int countSolutions(char[][] board, int row, int tq) {
        if (tq == 0) {
            return 1; // Found a valid solution
        }
        
        int count = 0;
        for (int col = 0; col < board.length; col++) {
            if (isItSafe(board, row, col)) {
                board[row][col] = 'Q';
                count += countSolutions(board, row + 1, tq - 1);
                board[row][col] = '.';
            }
        }
        return count;
    }
    
    private boolean isItSafe(char[][] board, int row, int col) {
        for (int r = row; r >= 0; r--) {
            if (board[r][col] == 'Q') return false;
        }
        
        for (int r = row, c = col; r >= 0 && c >= 0; r--, c--) {
            if (board[r][c] == 'Q') return false;
        }
        
        for (int r = row, c = col; r >= 0 && c < board.length; r--, c++) {
            if (board[r][c] == 'Q') return false;
        }
        
        return true;
    }
}
