// Last updated: 8/8/2026, 7:57:33 PM
1class Solution {
2    public int majorityElement(int[] nums) {
3        int v=1;
4        int n=nums.length;
5        int a=nums[0];
6        for(int i=1;i<n;i++){
7            if(nums[i]==a){
8                v++;
9            }else{
10                v--;
11                if(v==0){
12                    a=nums[i];
13                    v=1;
14                }
15            }
16        }
17        return a;
18    }
19}