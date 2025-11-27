// Last updated: 11/27/2025, 9:31:48 PM
1class Solution {
2    public long maxSubarraySum(int[] nums, int k) {
3        int n=nums.length;
4        long[] minPrefix=new long[k];
5        Arrays.fill(minPrefix,Long.MAX_VALUE);
6        long prefix=0;
7        long ans=Long.MIN_VALUE;
8        minPrefix[k-1] = 0;
9        for (int i=0;i<n;i++) {
10            prefix += nums[i];
11            int r=i%k;
12            if (minPrefix[r] !=Long.MAX_VALUE) {
13                ans=Math.max(ans, prefix-minPrefix[r]);
14            }
15            minPrefix[r] = Math.min(minPrefix[r],prefix);
16        }
17        return ans;
18    }
19}
20