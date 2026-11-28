// Last updated: 11/28/2026, 8:20:06 PM
1class Solution {
2    public int integerReplacement(int n) {
3        int Count=0;
4        long nums=n;
5        while (nums != 1) {
6            if ((nums & 1) == 0) {
7                nums=nums/2;
8            } else {
9                if (nums == 3 || ((nums & 2) == 0)) {
10                    nums--;
11                } else {
12                    nums++;
13                }
14            }
15            Count++;
16        }
17        return Count;
18    }
19}
20