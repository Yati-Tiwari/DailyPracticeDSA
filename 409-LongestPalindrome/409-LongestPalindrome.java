// Last updated: 8/14/2025, 11:24:06 AM
class Solution {
    public int longestPalindrome(String s) {
        int[] Freq = new int[128];
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            Freq[ch]++;
        }
        int length = 0;
        boolean oddFound = false;
        for (int i = 0; i < Freq.length; i++) {
            length += (Freq[i] / 2) * 2;
            if (Freq[i] % 2 == 1) {
                oddFound = true;
            }
        }
        if (oddFound) {
            length += 1;
        }
        return length;
    }
}
