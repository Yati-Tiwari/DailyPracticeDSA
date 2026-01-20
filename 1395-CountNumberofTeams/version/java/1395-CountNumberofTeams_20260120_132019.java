// Last updated: 1/20/2026, 1:20:19 PM
1class Solution {
2    public int numTeams(int[] rating) {
3        int n=rating.length;
4        int cnt=0;
5        for(int j=1;j<n-1; j++) {
6            int leftSmaller=0,leftGreater=0;
7            int rightSmaller=0, rightGreater=0;
8            for(int i=0; i<j; i++) {
9                if(rating[i] < rating[j]){
10                    leftSmaller++;
11                }
12                else if(rating[i] > rating[j]){
13                    leftGreater++;
14                }
15            }
16            for(int k=j+1; k <n; k++) {
17                if (rating[k] > rating[j])rightGreater++;
18                else if (rating[k] < rating[j]){
19                    rightSmaller++;
20                }
21            }
22            cnt+=leftSmaller*rightGreater;
23            cnt+=leftGreater*rightSmaller;
24        }
25        return cnt;
26    }
27}
28