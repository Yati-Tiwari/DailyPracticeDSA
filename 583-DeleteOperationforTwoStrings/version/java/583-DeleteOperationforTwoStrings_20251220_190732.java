// Last updated: 12/20/2025, 7:07:32 PM
1class Solution {
2    public int minDistance(String word1, String word2) {
3        int m=word1.length();
4        int n=word2.length();
5        int[] dp=new int[n+1];
6        for (int i=1;i<=m;i++) {
7            int prevs=0;
8            for (int j=1;j<=n;j++){
9                int temp=dp[j];
10                if (word1.charAt(i-1)==word2.charAt(j-1)){
11                    dp[j]=prevs+1;
12                } else {
13                    dp[j]=Math.max(dp[j],dp[j-1]);
14                }
15                prevs=temp;
16            }
17        }
18        int ans=(m-dp[n])+(n-dp[n]);
19        return ans;
20    }
21}
22