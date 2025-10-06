// Last updated: 10/6/2025, 10:40:15 AM
class Solution {
    public boolean isMatch(String s, String p) {
        int m = s.length();
        int n = p.length();

        // previous and current rows
        boolean[] prev = new boolean[n + 1];
        boolean[] curr = new boolean[n + 1];

        // Empty string matches empty pattern
        prev[0] = true;

        // If pattern starts with '*', it can match empty string
        for (int j = 0; j < n; ++j) {
            if (p.charAt(j) == '*')
                prev[j + 1] = prev[j];
        }

        // Fill DP row by row
        for (int i = 0; i < m; ++i) {
            curr[0] = false; // non-empty string can't match empty pattern

            for (int j = 0; j < n; ++j) {
                if (p.charAt(j) == '*') {
                    boolean matchEmpty = curr[j];   // * matches empty
                    boolean matchSome = prev[j + 1]; // * matches one or more chars
                    curr[j + 1] = matchEmpty || matchSome;
                } else if (p.charAt(j) == '?' || s.charAt(i) == p.charAt(j)) {
                    curr[j + 1] = prev[j];
                } else {
                    curr[j + 1] = false;
                }
            }

            // Move current row → previous row for next iteration
            prev = curr.clone();
        }

        return prev[n];
    }
}
