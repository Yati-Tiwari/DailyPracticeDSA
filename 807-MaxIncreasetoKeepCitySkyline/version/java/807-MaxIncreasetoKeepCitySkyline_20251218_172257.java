// Last updated: 12/18/2025, 5:22:57 PM
1class Solution {
2    public int maxIncreaseKeepingSkyline(int[][] grid) {
3        int n=grid.length;
4        int m=grid[0].length;
5        int[] rMax=new int[n];
6        int[] cMax=new int[m];
7        for (int i=0;i<n; i++) {
8            for (int j=0; j<m;j++) {
9                rMax[i]=Math.max(rMax[i],grid[i][j]);
10            }
11        }
12        for (int j=0;j<m; j++) {
13            for (int i=0; i<n;i++) {
14                cMax[j]=Math.max(cMax[j],grid[i][j]);
15            }
16        }
17        int TotalIncrease=0;
18        for (int i=0;i < n;i++) {
19            for (int j=0;j<m;j++) {
20                int AllowedHeight=Math.min(rMax[i],cMax[j]);
21                TotalIncrease +=AllowedHeight-grid[i][j];
22            }
23        }
24        return TotalIncrease;
25    }
26}
27