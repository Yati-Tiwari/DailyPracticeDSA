// Last updated: 12/28/2025, 5:48:50 PM
1class Solution {
2    public long maximumSubsequenceCount(String text, String pattern) {
3        long count_1=0;
4        long count_2=0;
5        long Result=0;
6        for (int i=0; i < text.length(); i++) {
7            if (text.charAt(i)==pattern.charAt(1)) {
8                Result += count_1;
9                count_2++;
10            }
11            if (text.charAt(i)==pattern.charAt(0)) {
12                count_1++;
13            }
14        }
15        long option1=Result + count_2;
16        long option2=Result + count_1;
17        return Math.max(option1, option2);
18    }
19}
20