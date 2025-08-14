// Last updated: 8/14/2025, 11:16:34 AM
class Solution {
    public int countArrays(int[] original, int[][] bounds) {
        int minVal=bounds[0][0];
        int maxVal=bounds[0][1];
        for (int i=1;i<original.length;i++) {
            int diff=original[i] - original[i-1];
            minVal=Math.max(minVal + diff,bounds[i][0]);
            maxVal=Math.min(maxVal + diff,bounds[i][1]);
        }
        return Math.max(0,maxVal-minVal+1);
    }
}
