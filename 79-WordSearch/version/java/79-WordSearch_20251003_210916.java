// Last updated: 10/3/2025, 9:09:16 PM
class Solution {
    public boolean exist(char[][] board, String word) {
        int row = board.length;
        int col = board[0].length;
        boolean result = false;
        boolean[][] visited = new boolean[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (board[i][j] == word.charAt(0)) {
                    result = backtrack(board, word, visited, i, j, 0);
                    if (result)
                        return true;
                }

            }
        }
        return false;

    }

    public static boolean backtrack(char[][] board,String word,boolean[][] visited,int i,int j,int index){
        if(index==word.length()) return true;
    if(i<0||i>=board.length||j<0||j>=board[0].length||visited[i][j]||board[i][j]!=word.charAt(index))

    {
        return false;
    }
    visited[i][j]=true;
    if(backtrack(board, word, visited, i + 1, j, index + 1) ||
           backtrack(board, word, visited, i -1, j, index + 1) ||
           backtrack(board, word, visited, i , j-1, index + 1) ||
           backtrack(board, word, visited, i , j+1, index + 1)){
            return true;
           }
            visited[i][j]=false;
            return false;
}
}