// Last updated: 12/6/2025, 11:13:01 AM
1class Solution {
2    public boolean isMatch(String s, String p) {
3        int i = 0, j = 0;
4        int starIdx = -1, match = 0;
5
6        while (i < s.length()) {
7            //  Characters match or '?'
8            if (j < p.length() && (p.charAt(j) == '?' || p.charAt(j) == s.charAt(i))) {
9                i++;
10                j++;
11            }
12            //  Pattern has '*'
13            else if (j < p.length() && p.charAt(j) == '*') {
14                starIdx = j;
15                match = i;
16                j++;
17            }
18            // Mismatch but previous '*' exists → backtrack
19            else if (starIdx != -1) {
20                j = starIdx + 1;
21                match++;
22                i = match;
23            }
24            //  Mismatch and no '*' → fail
25            else {
26                return false;
27            }
28        }
29        //  Skip remaining '*' in pattern
30        while (j < p.length() && p.charAt(j) == '*') {
31            j++;
32        }
33
34        return j == p.length();
35    }
36}
37