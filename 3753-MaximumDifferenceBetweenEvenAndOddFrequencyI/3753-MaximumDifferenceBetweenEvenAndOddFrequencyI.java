// Last updated: 8/14/2025, 11:16:39 AM
import java.util.*;

class Solution {
    public int maxDifference(String s) {
        int[] freq = new int[26];
        
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }
        
        int maxOdd = Integer.MIN_VALUE;
        int minEven = Integer.MAX_VALUE;
        
        for (int i = 0; i < 26; i++) {
            if (freq[i] > 0) {
                if ((freq[i] & 1) == 1) {
                    maxOdd = Math.max(maxOdd, freq[i]);
                } else {
                    minEven = Math.min(minEven, freq[i]);
                }
            }
        }
        
        return maxOdd - minEven;
    }
}