// Last updated: 8/14/2025, 11:18:07 AM
class Solution {
    public int appendCharacters(String s, String t) {
        int i=0;
        int j=0;
        int sLength=s.length();
        int tLength=t.length();
        while (i < sLength && j < tLength) {
            if (s.charAt(i)==t.charAt(j)) {
                j++;
            }
            i++;
        }
        return tLength-j;
    }
}
