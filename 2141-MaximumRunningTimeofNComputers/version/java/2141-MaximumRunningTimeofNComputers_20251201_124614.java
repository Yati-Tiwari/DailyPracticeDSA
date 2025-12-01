// Last updated: 12/1/2025, 12:46:14 PM
1class Solution {
2    public long maxRunTime(int n, int[] batteries) {
3        long sum=0;
4        for (int i=0;i<batteries.length;i++){
5            sum+=batteries[i];
6        } 
7        long left=0;
8        long  right=sum / n;
9        while (left<right) {
10            long mid=right - (right-left) / 2;
11            long total=0;
12            for (int i=0;i<batteries.length;i++) {
13                total += Math.min((long)batteries[i], mid);
14                if (total >= (long)n * mid) {
15                    break;
16                }
17            }
18            if (total >= (long)n * mid) {
19                left=mid;
20            }
21            else {
22                right=mid - 1;
23            }
24        }
25        return left;
26    }
27}
28