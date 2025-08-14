// Last updated: 8/14/2025, 11:24:14 AM
class Solution {
    public boolean isSubsequence(String s, String t) {
        int s_Idx=0;
        int t_Idx=0;
        while (s_Idx < s.length() && t_Idx < t.length()) {
            if (s.charAt(s_Idx) == t.charAt(t_Idx)) {
                s_Idx++;
            }
            t_Idx++;
        }
        boolean isSubsequence=(s_Idx == s.length());
        return isSubsequence;
    }
}
