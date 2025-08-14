// Last updated: 8/14/2025, 11:24:59 AM
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row=0;
        int col=matrix[0].length-1;
        while(row<matrix.length && col>=0){
            if(matrix[row][col]==target){
                return true;
            }
            else if(matrix[row][col]>target){
                col--;
            }
         
            else{
        row++;
       }

        // for(int i=0;i<matrix.length;i++){
        //     for(int j=0;j<matrix[0].length;j++){
        //         if(target==matrix[i][j]){
        //             return true;
        //         }
        //     }
        // }
        // return false;
    }return false;
}
}