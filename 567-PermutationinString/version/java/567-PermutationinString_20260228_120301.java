// Last updated: 2/28/2026, 12:03:01 PM
1class Solution {
2    // helper function to compare two frequency arrays
3    private boolean isfreqSame(int[] freq1, int[] freq2) {
4        for (int i = 0; i < 26; i++) {
5            if (freq1[i] != freq2[i]) {
6                return false;
7            }
8        }
9        return true;
10    }
11    public boolean checkInclusion(String s1, String s2) {
12        // permutations means different arrangements or orders of same class,characters
13        // in this permutation no.of counts or frquency of chararcters are same
14        // step 1: store the frequency of chars in s1
15
16        int[] freq = new int[26];
17        // Count frequency of characters in s1
18        for (int i = 0; i < s1.length(); i++) {
19            freq[s1.charAt(i) - 'a']++;
20        }
21        int windowsize = s1.length();
22        for (int i = 0; i <= s2.length() - windowsize; i++) {
23            int[] windowfreq = new int[26];
24
25            // Build frequency for current window in s2
26            for (int j = 0; j < windowsize; j++) {
27                windowfreq[s2.charAt(i + j) - 'a']++;
28            }
29            if (isfreqSame(freq, windowfreq)) {
30                return true; // Found a matching permutation
31            }
32        }
33        return false; // No permutation found
34    }
35}
36