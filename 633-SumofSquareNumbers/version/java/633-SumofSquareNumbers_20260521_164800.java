// Last updated: 5/21/2026, 4:48:00 PM
1class Solution {
2    public boolean judgeSquareSum(int c) {
3        int a=0;
4        int b=0;
5        while ((long)b * b<=c) {
6            b++;
7        }
8        b--;
9        while (a<=b) {
10            long sum=(long)a * a+(long)b * b;
11            if (sum==c) {
12                return true;
13            } else if (sum < c) {
14                a++;
15            } else {
16                b--;
17            }
18        }
19        return false;
20    }
21}
22