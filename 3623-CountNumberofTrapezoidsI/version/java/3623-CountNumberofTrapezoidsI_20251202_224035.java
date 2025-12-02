// Last updated: 12/2/2025, 10:40:35 PM
1class Solution {
2    public int countTrapezoids(int[][] points) {
3        int MOD=1_000_000_007;
4        Arrays.sort(points, (a,b) -> a[1] - b[1]);
5        long sum=0;
6        long ans=0;
7        int i=0;
8        while (i<points.length) {
9            int j=i;
10            while (j < points.length && points[j][1]==points[i][1]) {
11                j++;
12            }
13            int c=j-i;
14            if (c>= 2) {
15                long x =(long) c * (c-1) / 2;
16                ans=(ans + x * sum) % MOD;
17                sum=(sum + x) % MOD;
18            }
19            i=j;
20        }
21        return (int) ans;
22    }
23}
24