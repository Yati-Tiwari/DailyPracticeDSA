// Last updated: 8/14/2025, 11:23:07 AM
class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m=mat.length;
        int n=mat[0].length;
        if (m * n != r * c) {
            return mat;
        }
        int[][]  Answer=new int[r][c];
        for (int i = 0; i < m * n; i++) {
            Answer[i / c][i % c] = mat[i / n][i % n];
        }
        return Answer;
    }
}
