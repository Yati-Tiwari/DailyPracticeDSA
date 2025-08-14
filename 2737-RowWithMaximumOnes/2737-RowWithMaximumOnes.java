// Last updated: 8/14/2025, 11:17:45 AM
class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int maxOnes = 0;
        int rowIndex = 0;
        for (int i = 0; i < mat.length; i++) {
            int count = 0;
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == 1) {
                    count++;
                }
            }
            if (count > maxOnes) {
                maxOnes = count;
                rowIndex = i;
            }
        }
        int[] result = new int[2];
        result[0] = rowIndex;
        result[1] = maxOnes;
        return result;

    }
}