// Last updated: 8/14/2025, 11:21:19 AM
class Solution {
    public int minDeletionSize(String[] strs) {
        int rows = strs.length;
        int cols = strs[0].length();
        int count = 0;

        for (int column = 0; column< cols; column++) {
            for (int row = 1; row < rows; row++) {
                if (strs[row].charAt(column) < strs[row - 1].charAt(column)) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}
