// Last updated: 3/16/2026, 3:40:57 PM
1class Solution {
2    public int minCostClimbingStairs(int[] cost) {
3        int n=cost.length;
4        int[] dp=new int[n];
5         Arrays.fill(dp,-1);
6        return Math.min(sol(dp,cost,0),sol(dp,cost,1));
7
8    }
9    public static int sol(int[] dp,int[] cost,int idx){
10        if(idx>=cost.length){
11            return 0;
12        }
13        if(dp[idx]!=-1){
14            return dp[idx];
15        }
16        int a=sol(dp,cost,idx+1);
17        int b=sol(dp,cost,idx+2);
18        return dp[idx]=cost[idx]+Math.min(a,b);
19    }
20}