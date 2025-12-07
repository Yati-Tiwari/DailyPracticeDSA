// Last updated: 12/7/2025, 9:23:21 AM
1class Solution {
2    public int largestPrime(int n) {
3        int rst=0;
4        int sam=0;
5        for(int i=2;i<=n;i++){
6            boolean ip=true;
7            for(int o=2;o*o<=i;o++){
8                if(i%o==0){
9                    ip=false;
10                    break;
11                }
12            }
13            if(!ip)continue;
14            sam+=i;
15            if(sam>n)break;
16            boolean sp=true;
17            for(int o=2;o*o<=sam;o++){
18                if(sam%o==0){
19                    sp=false;
20                    break;
21                }
22            }
23            if(sp)rst=sam;
24        }
25        return rst;
26    }
27}