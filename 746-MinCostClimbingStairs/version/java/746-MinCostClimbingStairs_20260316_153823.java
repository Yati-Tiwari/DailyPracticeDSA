// Last updated: 3/16/2026, 3:38:23 PM
1class Solution {
2    public int minCostClimbingStairs(int[] cost) {
3        int n=cost.length;
4        int[] dp=new int[n];
5        for(int i=0;i<n;i++){
6            Arrays.fill(dp,-1);
7        }
8        return Math.min(sol(dp,cost,0),sol(dp,cost,1));
9
10    }
11    public static int sol(int[] dp,int[] cost,int idx){
12        if(idx>=cost.length){
13            return 0;
14        }
15        if(dp[idx]!=-1){
16            return dp[idx];
17        }
18        int a=sol(dp,cost,idx+1);
19        int b=sol(dp,cost,idx+2);
20        return dp[idx]=cost[idx]+Math.min(a,b);
21    }
22}