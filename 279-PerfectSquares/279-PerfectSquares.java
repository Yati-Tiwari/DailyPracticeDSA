// Last updated: 8/14/2025, 11:24:50 AM
public class Solution {
    public int numSquares(int n) {
        int[] minSquares = new int[n + 1];
        
        for (int i = 0; i <= n; i++) {
            minSquares[i] = Integer.MAX_VALUE;
        }
        
        minSquares[0] = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j * j <= i; j++) {
                minSquares[i] = Math.min(minSquares[i], minSquares[i - j * j] + 1);
            }
        }

        return minSquares[n];
    }
}
