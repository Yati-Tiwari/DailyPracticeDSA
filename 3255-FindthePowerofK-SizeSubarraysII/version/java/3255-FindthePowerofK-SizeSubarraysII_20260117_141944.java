// Last updated: 1/17/2026, 2:19:44 PM
1class Solution {
2    public int[] resultsArray(int[] nums, int k) {
3        int n=nums.length;
4        int[] f= new int[n];
5        Arrays.fill(f,1);
6        for (int i = 1; i < n; ++i) {
7            if (nums[i]==nums[i-1] + 1) {
8                f[i]=f[i-1] + 1;
9            }
10        }
11        int[] ans=new int[n-k+1];
12        for (int i=k-1; i<n;i++) {
13            if (f[i]>=k) {
14                ans[i-k+1]=nums[i];
15            } else {
16                ans[i-k+1] =-1;
17            }
18        }
19        return ans;
20    }
21}