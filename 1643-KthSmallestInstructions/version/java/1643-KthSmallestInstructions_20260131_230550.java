// Last updated: 1/31/2026, 11:05:50 PM
1class Solution {
2    public String kthSmallestPath(int[] destination, int k) {
3        int V=destination[0];
4        int H=destination[1];
5        StringBuilder ans=new StringBuilder();
6        while(V>0 || H>0){
7            if(H==0){
8                ans.append('V');
9                V--;
10            }else if (V==0){
11                ans.append('H');
12                H--;
13            } else{
14                long cnt=nCr(H + V-1,V);
15                if (k<=cnt) {
16                    ans.append('H');
17                    H--;
18                } else {
19                    ans.append('V');
20                    k-=cnt;
21                    V--;
22                }
23            }
24        }
25        return ans.toString();
26    }
27    private long nCr(int n,int r) {
28        r=Math.min(r,n-r);
29        long rslt=1;
30        for (int i=1;i<=r;i++) {
31            rslt=rslt * (n-r+i) / i;
32        }
33        return rslt;
34    }
35}