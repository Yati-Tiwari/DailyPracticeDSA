// Last updated: 1/23/2026, 9:58:50 PM
1class Solution {
2    public boolean isItPossible(String word1, String word2) {
3        int[] f1=new int[26];
4        int[] f2=new int[26];
5        //frequency of word1 liya
6        for (int i=0; i<word1.length();i++) {
7            f1[word1.charAt(i) - 'a']++;
8        }
9        //frequency of word2 li
10        for (int i=0; i<word2.length(); i++) {
11            f2[word2.charAt(i) - 'a']++;
12        }
13        //try all possible swaps
14        for (int i=0; i < 26; i++) {
15            for (int j=0; j < 26; j++) {
16                if (f1[i]==0 || f2[j]==0){
17                    continue;
18                }
19                //swap i from word1 with j from word2
20                f1[i]--; 
21                f2[j]--;
22                f1[j]++; 
23                f2[i]++;
24                //count distinct characters
25                int d1=0, d2=0;
26                for (int k=0; k<26; k++) {
27                    if(f1[k] >0){
28                        d1++;
29                    }
30                    if(f2[k]> 0){
31                        d2++;
32                    }
33                }
34                if (d1==d2){
35                    return true;
36                }
37                // revert swap
38                f1[j]--; 
39                f2[i]--;
40                f1[i]++; 
41                f2[j]++;
42            }
43        }
44        return false;
45    }
46}
47