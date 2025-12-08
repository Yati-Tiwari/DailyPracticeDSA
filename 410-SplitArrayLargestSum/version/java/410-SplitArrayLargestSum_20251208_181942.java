// Last updated: 12/8/2025, 6:19:42 PM
1class Solution{
2    public int splitArray(int[] nums,int k){
3        int l=0;
4        int r=0;
5        for(int i=0;i<nums.length;i++){
6            l=Math.max(l,nums[i]);
7            r+=nums[i];
8        }
9        while(l<r){
10            int m=l+(r-l)/2;
11            int c=0;
12            int p=1;
13            for(int i=0;i<nums.length;i++){
14                if(c+nums[i]>m){
15                    p++;
16                    c=nums[i];
17                }
18                else {
19                    c+=nums[i];
20                }
21            }
22            if(p>k){
23                l=m+1;
24            }
25            else {
26                r=m;
27            }
28        }
29        return l;
30    }
31}
32