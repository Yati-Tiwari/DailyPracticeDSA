// Last updated: 12/3/2025, 12:33:39 PM
1class Solution {
2    public int numSubmat(int[][] mat) {
3        int n=mat.length;
4        int m=mat[0].length;
5        int[] height=new int[m];
6        int ans=0;
7        for (int i=0;i<n;i++) {
8            for (int j=0; j<m; j++) {
9                height[j]=(mat[i][j]==0) ? 0 : height[j]+1;
10            }
11            for (int j=0; j < m; j++) {
12                int min=height[j];
13                for (int k=j;k>=0 && min>0; k--) {
14                    min=Math.min(min,height[k]);
15                    ans +=min;
16                }
17            }
18        }
19        return ans;
20    }
21}
22