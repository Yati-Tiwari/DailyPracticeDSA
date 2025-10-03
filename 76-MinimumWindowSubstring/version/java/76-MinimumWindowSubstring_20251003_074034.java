// Last updated: 10/3/2025, 7:40:34 AM
class Solution {
    public String minWindow(String s, String t) {
        if (s == null || t == null || s.length() < t.length()) {
            return "";
        }
        // store frequency of chars in t
        int[] need = new int[128];
        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            need[c]++;
        }
        int left = 0, right = 0;
        int count = t.length();     // how many chars still needed
        int minLen = Integer.MAX_VALUE;
        int start = 0;

        while (right < s.length()) {
            char r = s.charAt(right);

            if (need[r] > 0) {
                count--;
            }
            need[r]--;
            right++;

            // try shrinking from left if valid
            while (count == 0) {
                if (right - left < minLen) {
                    minLen = right - left;
                    start = left;
                }
                char l = s.charAt(left);
                need[l]++;
                if (need[l] > 0) {
                    count++;
                }
                left++;
            }
        }
        if (minLen == Integer.MAX_VALUE) {
            return "";
        } else {
            return s.substring(start, start + minLen);
        }
    }
}
