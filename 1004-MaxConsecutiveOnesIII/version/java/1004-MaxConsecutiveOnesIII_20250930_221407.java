// Last updated: 9/30/2025, 10:14:07 PM
class Solution {
    // helper function to compare two frequency arrays
    private boolean isfreqSame(int[] freq1, int[] freq2) {
        for (int i = 0; i < 26; i++) {
            if (freq1[i] != freq2[i]) {
                return false;
            }
        }
        return true;
    }

    public boolean checkInclusion(String s1, String s2) {
        // permutations means different arrangements or orders of same class,characters
        // in this permutation no.of counts or frquency of chararcters are same
        // step 1: store the frequency of chars in s1

        int[] freq = new int[26];
        // Count frequency of characters in s1
        for (int i = 0; i < s1.length(); i++) {
            freq[s1.charAt(i) - 'a']++;
        }

        int windowsize = s1.length();

        for (int i = 0; i <= s2.length() - windowsize; i++) {
            int[] windowfreq = new int[26];

            // Build frequency for current window in s2
            for (int j = 0; j < windowsize; j++) {
                windowfreq[s2.charAt(i + j) - 'a']++;
            }

            if (isfreqSame(freq, windowfreq)) {
                return true; // Found a matching permutation
            }
        }

        return false; // No permutation found
    }
}
