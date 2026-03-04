// Last updated: 3/4/2026, 9:15:57 AM
1class Solution {
2    public int numSpecial(int[][] mat) {
3       int m=mat.length;
4       int n=mat[0].length;
5       int[] rowsum=new int[m];
6       int[] colsum=new int[n];
7       for(int i=0;i<m;i++){
8        for(int j=0;j<n;j++){
9            rowsum[i]+=mat[i][j];
10            colsum[j]+=mat[i][j];
11        }
12       }
13       int ans=0;
14       for(int i=0;i<m;i++){
15        for(int j=0;j<n;j++){
16            if(mat[i][j]==1 && rowsum[i]==1 && colsum[j]==1){
17                ans++;
18            }
19        }
20       }
21       return ans;
22    }
23}