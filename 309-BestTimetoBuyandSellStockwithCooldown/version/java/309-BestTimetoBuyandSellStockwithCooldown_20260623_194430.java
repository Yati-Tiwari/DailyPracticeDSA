// Last updated: 6/23/2026, 7:44:30 PM
1class Solution {
2    public int maxProfit(int[] prices) {
3        int n=prices.length;
4        int[][] dp=new int[n][2];
5        for(int[] i:dp){
6            Arrays.fill(i,-1);
7        }
8        return solve(0,1,prices,dp);
9    }
10    public int solve(int i,int canBuy,int[] prices,int[][] dp) {
11        if (i>=prices.length){
12            return 0;
13        }
14        if (dp[i][canBuy] != -1) {
15            return dp[i][canBuy];
16        }
17        int profit;
18        if (canBuy==1) {
19            int buy = -prices[i] + solve(i+1, 0, prices,dp);
20            int skip=solve(i + 1,1, prices, dp);
21            profit=Math.max(buy,skip);
22        } else {
23            int sell=prices[i] + solve(i+2,1,prices,dp); // cooldown
24            int hold=solve(i+1,0,prices,dp);
25            profit=Math.max(sell, hold);
26        }
27        return dp[i][canBuy]=profit;
28    }
29}
30