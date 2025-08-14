// Last updated: 8/14/2025, 11:19:34 AM
import java.util.Arrays;

class Solution {
    public int largestSubmatrix(int[][] matrix) {
        int rows = matrix.length, cols = matrix[0].length;

        for (int i = 1; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == 1) {
                    matrix[i][j] += matrix[i - 1][j];
                }
            }
        }

        int maxArea = 0;

        for (int i = 0; i < rows; i++) {
            Arrays.sort(matrix[i]);
            for (int j = 0; j < cols; j++) {
                int height = matrix[i][cols - 1 - j];
                maxArea = Math.max(maxArea, height * (j + 1));
            }
        }

        return maxArea;
    }
}
