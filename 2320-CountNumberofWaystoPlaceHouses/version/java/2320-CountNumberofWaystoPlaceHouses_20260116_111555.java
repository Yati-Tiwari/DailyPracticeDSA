// Last updated: 1/16/2026, 11:15:55 AM
1class Solution {
2    static int MOD=1000000007;
3    public int countHousePlacements(int n) {
4        long[] dp=new long[n+1];
5        Arrays.fill(dp,-1);  
6        long ans=ways(n,dp);
7        return (int)((ans*ans)%MOD);   
8    }
9    public static long ways(int n,long[]dp){
10        if(n==0){
11            return 1;
12        }
13        if(n==1){
14            return 2;
15        }
16        if(dp[n]!=-1){
17            return dp[n];
18        }
19        long empty=ways(n-1,dp);
20        long house=ways(n-2,dp);
21        return dp[n]=(empty+house) %MOD;
22    }
23}