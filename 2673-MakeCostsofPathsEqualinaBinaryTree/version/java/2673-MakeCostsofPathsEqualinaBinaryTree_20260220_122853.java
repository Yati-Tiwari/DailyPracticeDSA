// Last updated: 2/20/2026, 12:28:53 PM
1class Solution {
2    public int minIncrements(int n, int[] cost) {
3        int res=0;
4        for(int i=n/2-1; i>=0;i--) {
5            int left= i*2+1;
6            int right= i*2+2;
7            res+=Math.abs(cost[left]-cost[right]);
8            cost[i]+=Math.max(cost[left],cost[right]);
9        }
10        return res;
11    }
12}