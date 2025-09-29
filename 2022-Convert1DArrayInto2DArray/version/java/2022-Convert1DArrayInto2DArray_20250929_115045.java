// Last updated: 9/29/2025, 11:50:45 AM
class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        if(original.length != m*n){
            return new int[0][0];
        }
        int[][] matrix=new int[m][n];
        for(int i=0;i<original.length;i++){
            int row=i/n;
            int col=i%n;
            matrix[row][col]=original[i];
        }
        return matrix;
    }
 
}