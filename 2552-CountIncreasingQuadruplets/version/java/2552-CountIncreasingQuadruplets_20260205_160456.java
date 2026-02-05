// Last updated: 2/5/2026, 4:04:56 PM
1class Solution {
2    public long countQuadruplets(int[] nums) {
3        int n=nums.length;
4        long ans=0;
5        int[] dp=new int[n]; // dp[j] tracks count of valid (i,k) pairs for each j
6        for(int k=2; k<n;k++){
7            int numLessThanK=0;
8            for(int j=0; j<k;j++){
9                if(nums[j] < nums[k]){
10                    numLessThanK++;
11                    ans +=dp[j]; // add valid quadruplets ending at (j,k)
12                } else if(nums[j] > nums[k]){
13                    dp[j]+=numLessThanK; // update dp for future l
14                }
15            }
16        }
17        return ans;
18    }
19}