// Last updated: 4/1/2026, 3:13:43 PM
1class Solution {
2    public int[] findMissingAndRepeatedValues(int[][] grid) {
3        int n=grid.length;
4        int size=n*n;
5        int[] f=new int[size+1];
6        for(int i=0;i<n;i++){
7            for(int j=0;j<n;j++){
8                f[grid[i][j]]++;
9            }
10        }
11        int missing=-1;
12        int repeat=-1;
13        for(int i=1;i<=size;i++){
14            if(f[i]==0){
15                missing=i;
16            }
17            if(f[i]==2){
18                repeat=i;
19            }
20        }
21        return new int[]{repeat,missing};
22    }
23}