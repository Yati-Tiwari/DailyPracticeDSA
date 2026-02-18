// Last updated: 2/18/2026, 11:08:34 AM
1class Solution {
2    public boolean hasAlternatingBits(int n) {
3        n ^= (n >> 1);
4        return (n & (n + 1))==0;
5    }
6}
7