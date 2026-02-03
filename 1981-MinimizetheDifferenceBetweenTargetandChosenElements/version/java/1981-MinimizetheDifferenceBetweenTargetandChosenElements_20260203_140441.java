// Last updated: 2/3/2026, 2:04:41 PM
1class Solution {
2    public int minimizeTheDifference(int[][] mat, int target) {
3        int m=mat.length;
4        int maxSum=4900; // constraints ke hisaab se safe limit
5        boolean[] dp =new boolean[maxSum + 1];
6        dp[0] =true; // starting sum
7        // har row process karo
8        for (int i=0; i < m; i++) {
9            boolean[] next=new boolean[maxSum + 1];
10            for (int j= 0; j<=maxSum; j++) {
11                if (dp[j]==true) { 
12                    for (int k=0; k < mat[i].length; k++) {
13                        int val=mat[i][k];
14                        if (j+ val<=maxSum) {
15                            next[j+ val]=true;
16                        }
17                    }
18                }
19            }
20            dp=next; // move to next row
21        }
22        int ans=Integer.MAX_VALUE;
23        // target ke closest sum find karo
24        for (int j=0; j<=maxSum; j++) {
25            if (dp[j]) {
26                ans = Math.min(ans, Math.abs(j-target));
27            }
28        }
29        return ans;
30    }
31}
32