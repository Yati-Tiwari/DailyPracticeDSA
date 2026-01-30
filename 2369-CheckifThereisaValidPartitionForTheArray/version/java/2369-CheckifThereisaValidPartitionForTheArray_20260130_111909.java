// Last updated: 1/30/2026, 11:19:09 AM
1class Solution {
2    public boolean validPartition(int[] nums) {
3        int n=nums.length;
4        boolean[] dp=new boolean[n+1];
5        dp[n]=true;
6        for(int i=n-1;i>=0;i--){
7            if(i+1<n && nums[i]==nums[i+1] && dp[i+2]){
8                dp[i]=true;
9            }
10            if(i+2<n){
11                if(nums[i]==nums[i+1] && nums[i+1]==nums[i+2] && dp[i+3]){
12                    dp[i]=true;
13                }
14                if(nums[i+1]==nums[i]+1 && nums[i+2]==nums[i]+2 && dp[i+3]){
15                    dp[i]=true;
16                }
17            }
18        }
19        return dp[0];
20    }
21}
22