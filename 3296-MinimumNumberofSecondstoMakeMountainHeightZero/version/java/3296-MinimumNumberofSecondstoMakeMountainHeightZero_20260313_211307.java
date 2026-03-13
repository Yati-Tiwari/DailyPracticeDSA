// Last updated: 3/13/2026, 9:13:07 PM
1class Solution {
2    public long minNumberOfSeconds(int h, int[] t) {
3        long l=1;
4        long r=t[0]*(h*(h+1L))/2;
5        long ans=r;
6        while(l<=r){
7            long mid=(l+r)/2;
8            long total=0;
9            for(int i=0;i<t.length;i++){           
10                long x=(long)(Math.sqrt(1+4*(2*mid)/t[i])-1)/2;
11                total+=x;
12                if(total>=h){
13                    break;
14                }
15            }
16            if(total>=h){
17                ans=mid;
18                r=mid-1;
19            }
20            else{
21                l=mid+1;
22            }
23        }
24        return ans;
25    }
26}
27
28
29
30
31
32
33
34
35
36
37
38
39
40
41
42
43
44
45