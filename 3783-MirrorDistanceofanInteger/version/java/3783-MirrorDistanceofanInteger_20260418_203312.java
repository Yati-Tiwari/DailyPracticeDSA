// Last updated: 4/18/2026, 8:33:12 PM
1class Solution {
2    public int mirrorDistance(int n) {
3        int temp=n;
4        int sum=0;
5        while(n!=0){
6            int r=n%10;
7            sum=sum*10+r;
8            n/=10;
9        }
10        return Math.abs(temp-(sum));
11    }
12}