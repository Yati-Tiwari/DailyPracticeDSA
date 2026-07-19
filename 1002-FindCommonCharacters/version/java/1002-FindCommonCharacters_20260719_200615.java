// Last updated: 7/19/2026, 8:06:15 PM
1class Solution {
2    public List<String> commonChars(String[] words) {
3        int[] minFreq=new int[26];
4        for (int i = 0; i < 26; i++) {
5            minFreq[i] = Integer.MAX_VALUE;
6        }
7        for (int i = 0; i < words.length; i++) {
8            int[] freq = new int[26];
9            for (int j = 0; j < words[i].length(); j++) {
10                char c = words[i].charAt(j);
11                freq[c - 'a']++;
12            }
13            for (int k = 0; k < 26; k++) {
14                if (minFreq[k] > freq[k]) {
15                    minFreq[k] = freq[k];
16                }
17            }
18        }
19        List<String> result = new ArrayList<>();
20        for (int i = 0; i < 26; i++) {
21            for (int j = 0; j < minFreq[i]; j++) {
22                result.add("" + (char)(i + 'a'));
23            }
24        }
25        return result;
26    }
27}
28