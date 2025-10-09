// Last updated: 10/9/2025, 4:39:49 PM
class Solution {
    public boolean isMatch(String s, String p) {
        int i = 0, j = 0;
        int starIdx = -1, match = 0;

        while (i < s.length()) {
            //  Characters match or '?'
            if (j < p.length() && (p.charAt(j) == '?' || p.charAt(j) == s.charAt(i))) {
                i++;
                j++;
            }
            //  Pattern has '*'
            else if (j < p.length() && p.charAt(j) == '*') {
                starIdx = j;
                match = i;
                j++;
            }
            // Mismatch but previous '*' exists → backtrack
            else if (starIdx != -1) {
                j = starIdx + 1;
                match++;
                i = match;
            }
            //  Mismatch and no '*' → fail
            else {
                return false;
            }
        }
        //  Skip remaining '*' in pattern
        while (j < p.length() && p.charAt(j) == '*') {
            j++;
        }

        return j == p.length();
    }
}
