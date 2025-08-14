// Last updated: 8/14/2025, 11:21:42 AM
class Solution {
    public int[][] transpose(int[][] matrix) {
      int row=matrix.length;
      int column=matrix[0].length;
      int[][] transposeMatrix=new int[column][row];
      for(int i=0;i<row;i++){
        for(int j=0;j<column;j++){
            transposeMatrix[j][i]=matrix[i][j];
        }
      }
      return transposeMatrix;

    }
}