// Last updated: 1/15/2026, 11:39:06 AM
1class Solution {
2    public int minimumNumbers(int num, int k) {    
3        if (num==0) 
4        {
5            return 0;
6        }
7        for (int i=1;i<=10;i++) {
8            int sum = i*k;
9            if (sum<=num && sum % 10==num % 10) {
10                return i;
11            }
12        }
13        return -1;
14    }
15}