// Last updated: 4/26/2026, 12:22:22 PM
1class Solution {
2    public boolean searchMatrix(int[][] matrix, int target) {
3        for(int i=0;i<matrix.length;i++){
4            for(int j=0;j<matrix[0].length;j++){
5                if(target==matrix[i][j]){
6                    return true;
7                }
8            }
9        }
10        return false;
11    }
12}