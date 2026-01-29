// Last updated: 1/29/2026, 8:43:11 PM
1class Solution {
2    public int maxFrequency(int[] nums, int k) {
3        int MAX_VAL=50; 
4        int maxGain=0;
5        // Try kiya converting each possible value i into k
6        for(int i=1;i<=MAX_VAL;i++) {
7            if(i==k){
8                continue;
9            }
10            int sum=0;
11            int a=0;
12            for(int j=0;j<nums.length;j++) {
13                int num=nums[j];
14                if(num==i){
15                    sum++;          // gaining i se k
16                }else if(num==k) {
17                    sum--;          // losing existing k
18                }
19                if(sum<0){
20                    sum=0; 
21                }
22                a=Math.max(a,sum);
23            }
24            maxGain=Math.max(maxGain,a);
25        }
26        // Count original k values and add best subarray gain
27        int cntK=0;
28        for(int j=0;j<nums.length;j++) {
29            if(nums[j]==k){
30                cntK++;
31            }
32        }
33        return cntK+maxGain;
34    }
35}