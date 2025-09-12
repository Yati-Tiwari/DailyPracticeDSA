// Last updated: 9/12/2025, 9:00:39 PM
class Solution {
    public boolean doesAliceWin(String s) {
        String vowels = "aeiou";
        for (int i = 0; i < s.length(); i++) {
            if (vowels.indexOf(s.charAt(i)) != -1) {
                return true;
            }
        }
        return false;
    }
}
