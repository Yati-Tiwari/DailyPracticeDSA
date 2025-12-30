// Last updated: 12/30/2025, 10:47:20 AM
1class Solution {
2    public int findJudge(int n, int[][] trust) {
3        int[] trust_num=new int[n+1];
4        for (int i=0; i<trust.length; i++) {
5            int a=trust[i][0];
6            int b=trust[i][1];
7            trust_num[a]--;
8            trust_num[b]++;
9        }
10        for (int i=1; i<=n; i++) {
11            if (trust_num[i]==n-1) {
12                return i;
13            }
14        }
15        return -1;
16    }
17}
18