// Last updated: 12/10/2025, 7:39:27 PM
1class Solution {
2    public int countPermutations(int[] c) {
3        int n=c.length;
4        final int mod=1_000_000_007;
5        for (int i=1;i<n;i++) {
6            if (c[i]<=c[0]) {
7                return 0;
8            }
9        }
10        long ans=1;
11        for (int i=1;i<n;i++) {
12            ans=(ans*i) % mod;
13        }
14        return (int) ans;
15    }
16}
17