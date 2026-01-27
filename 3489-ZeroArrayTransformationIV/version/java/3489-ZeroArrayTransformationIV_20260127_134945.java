// Last updated: 1/27/2026, 1:49:45 PM
1class Solution {
2    public int minZeroArray(int[] nums, int[][] queries) {
3        int ans=-1;
4        for (int i=0; i < nums.length;i++) {
5            int[][] dp=new int[nums[i]+1][queries.length];
6            Arrays.stream(dp).forEach(row -> Arrays.fill(row, -1));
7            ans=Math.max(ans, solve(queries, i, nums[i], 0, dp));
8        }
9        if(ans > queries.length){
10            return -1;
11        }
12        return ans;
13    }
14    public int solve(int[][] q, int i,int target,int k,int[][] dp) {
15        if (target==0){
16            return k;
17        }
18        if (k >=q.length || target < 0){
19            return q.length +1;
20        }
21        if (dp[target][k] != -1){
22            return dp[target][k];
23        }
24        int res = solve(q,i, target,k+1,dp);
25        if (q[k][0]<=i && i<=q[k][1]){
26            res = Math.min(res, solve(q, i,target-q[k][2], k+1, dp));
27        }
28        return dp[target][k]=res;
29    }
30}