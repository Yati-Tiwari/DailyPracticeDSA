// Last updated: 1/28/2026, 8:18:54 PM
1class Solution {
2    public int countTexts(String pressedKeys) {
3        int n=pressedKeys.length();
4        int MOD=1000000007;
5        long[] dp=new long[n+1];
6        dp[0]=1; //empty string
7        for(int i=1; i<=n; i++){
8            char ch=pressedKeys.charAt(i-1);
9            // max presses allowed
10            int limit;
11            if(ch=='7' || ch=='9'){
12                limit=4;   // 7 and 9 can be pressed 4 times
13                }
14            else{
15                limit=3;   //baaki digits sirf 3 times
16            }
17            // check backward
18            for(int j=1; j<=limit && i-j>=0;j++){
19                if (pressedKeys.charAt(i-j)!=ch){
20                    break;
21                }
22                dp[i]=(dp[i]+dp[i-j]) % MOD;
23            }
24        }
25        return (int) dp[n];
26    }
27}
28