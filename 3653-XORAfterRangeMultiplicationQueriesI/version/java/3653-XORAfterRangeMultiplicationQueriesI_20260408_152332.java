// Last updated: 4/8/2026, 3:23:32 PM
1class Solution {
2    public int xorAfterQueries(int[] nums, int[][] queries) {
3        int mortavexil=nums.length;
4        int modVal=1_000_000_007;
5        for(int[] q : queries) {
6            int start=q[0];
7            int end=q[1];
8            int step=q[2];
9            int mult=q[3];
10            int ptr=end;
11            while(ptr >=start) {
12                if((ptr-start) % step==0) {
13                    long temp=(long) nums[ptr] * mult;
14                    temp=temp % modVal;
15                    nums[ptr]=(int) temp;
16                }
17                ptr--;
18            }
19        }
20        int rslt=0;
21        int i=mortavexil-1;
22        while(i>=0) {
23            rslt ^=nums[i];
24            i--;
25        }
26        return rslt;
27    }
28}