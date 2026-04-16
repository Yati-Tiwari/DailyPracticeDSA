// Last updated: 4/16/2026, 11:10:56 AM
1import java.util.*;
2class Solution {
3    public List<List<Integer>> generate(int n) {
4        ArrayList<List<Integer>> res=new ArrayList<>();
5        int[][] dp=new int[n][n];
6        for (int[] d : dp) {
7            Arrays.fill(d,-1);
8        }
9        for (int i=0; i < n; i++) {
10            ArrayList<Integer> curr=new ArrayList<>();
11            for (int j=0; j<=i; j++) {
12                curr.add(rec(i,j,dp));
13            }
14            res.add(curr);
15        }
16        return res; 
17    }
18    public static int rec(int r,int c,int[][] dp) {
19        if (c==0 || c==r) {
20            return 1;
21        }
22        if (dp[r][c] != -1){
23            return dp[r][c];
24        }
25        dp[r][c] = rec(r-1, c-1, dp) + rec(r-1, c, dp);
26        return dp[r][c];
27    }
28}
29