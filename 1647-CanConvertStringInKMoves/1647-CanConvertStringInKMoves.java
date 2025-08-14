// Last updated: 8/14/2025, 11:19:53 AM
class Solution {
    public boolean canConvertString(String s, String t, int k) {
        if (s.length()!=t.length()) {
            return false;
        }
        int[] shift_Count=new int[26];
        for (int i=0;i<s.length();i++) {
            int diff=(t.charAt(i)-s.charAt(i)+26) % 26;
            if (diff != 0) {
                shift_Count[diff]++;
                int Needed_Moves=diff +(shift_Count[diff] - 1) *26;
                if (Needed_Moves > k)
                {
                     return false;
                }
            }
        }
        return true;
    }
}
