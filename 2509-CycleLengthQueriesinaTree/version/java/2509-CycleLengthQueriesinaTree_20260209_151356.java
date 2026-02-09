// Last updated: 2/9/2026, 3:13:56 PM
1class Solution {
2    public int[] cycleLengthQueries(int n, int[][] queries) {
3        int[] ans=new int[queries.length];
4        for(int i=0;i<queries.length; i++){
5            int a=queries[i][0];
6            int b=queries[i][1];
7            int height=1;
8            while(a!=b){
9                if(a>b){
10                    a/=2; //move a up
11                }else{
12                    b/=2; //move b up
13                }
14                height++;
15            }
16            ans[i]=height;
17        }
18        return ans;
19    }
20}