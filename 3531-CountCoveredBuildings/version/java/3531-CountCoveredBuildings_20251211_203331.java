// Last updated: 12/11/2025, 8:33:31 PM
1class Solution {
2    public int countCoveredBuildings(int n, int[][] buildings) {
3        int[] rowMin=new int[n+1];
4        int[] rowMax=new int[n+1];
5        int[] colMin=new int[n+1];
6        int[] colMax=new int[n+1];
7        Arrays.fill(rowMin,Integer.MAX_VALUE);
8        Arrays.fill(colMin,Integer.MAX_VALUE);
9        for(int[] b: buildings){
10            int x=b[0];
11            int y=b[1];
12            rowMin[x]=Math.min(rowMin[x],y);
13            rowMax[x]=Math.max(rowMax[x],y);
14            colMin[y]=Math.min(colMin[y],x);
15            colMax[y]=Math.max(colMax[y],x);
16        }
17        int ans=0;
18        for(int[] b: buildings){
19            int x=b[0];
20            int y=b[1];
21            if(rowMin[x]<y && y<rowMax[x] && colMin[y]<x && x < colMax[y]){
22                ans++;
23            }
24        }
25        return ans;
26    }
27}
28