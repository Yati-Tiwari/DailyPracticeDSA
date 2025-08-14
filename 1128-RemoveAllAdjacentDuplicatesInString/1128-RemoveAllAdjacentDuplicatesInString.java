// Last updated: 8/14/2025, 11:20:51 AM
class Solution {
    public String removeDuplicates(String s) {
        StringBuilder SB=new StringBuilder();
        for (int i = 0;i < s.length();i++) {
            char ch=s.charAt(i);
            int LENGTH = SB.length();
            if (LENGTH > 0 && SB.charAt(LENGTH - 1) == ch)
                SB.deleteCharAt(LENGTH - 1);
            else
                SB.append(ch);
        }
        return SB.toString();
    }
}
