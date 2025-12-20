// Last updated: 12/20/2025, 12:37:25 PM
1class Solution {
2  public boolean predictTheWinner(int[] nums) {
3    int n=nums.length;
4    int[][] dp=new int[n][n];
5    for (int i=0;i<n;i++)
6      dp[i][i]=nums[i];
7    for (int d=1;d<n;d++)
8      for (int i=0;i+d<n;i++) {
9        int j=i+d;
10        dp[i][j]=Math.max(nums[i] - dp[i+1][j],nums[j] - dp[i][j-1]);
11    }
12    if(dp[0][n-1] >=0){
13        return true;
14    }
15    return false;
16   
17  }
18}