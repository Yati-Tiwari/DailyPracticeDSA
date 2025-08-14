// Last updated: 8/14/2025, 11:26:00 AM
class Solution {
    public boolean isPalindrome(String s) {
        char[] ch=s.toCharArray();
        int i=0;
        int j=ch.length - 1;
        while (i < j) {
            while (i < j && !Character.isLetterOrDigit(ch[i])) {
                i++;
            }
            while (i < j && !Character.isLetterOrDigit(ch[j])) {
                j--;
            }
            if (Character.toLowerCase(ch[i]) != Character.toLowerCase(ch[j])) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
