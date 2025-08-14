// Last updated: 8/14/2025, 11:23:26 AM
class Solution {
    public int longestPalindromeSubseq(String s) {
        int n = s.length();
        int[][] PalindromeLength = new int[n][n];
        for (int i = 0; i < n; i++) {
            PalindromeLength[i][i] = 1;
        }
        for (int len = 2; len <= n; len++) {
            for (int i = 0; i <= n - len; i++) {
                int j = i + len - 1;
                if (s.charAt(i) == s.charAt(j)) {
                    PalindromeLength[i][j] = PalindromeLength[i + 1][j - 1] + 2;
                } else {
                    PalindromeLength[i][j] = Math.max(PalindromeLength[i + 1][j], 
                        PalindromeLength[i][j - 1]);
                }
            }
        }
        return PalindromeLength[0][n - 1];
    }
}
