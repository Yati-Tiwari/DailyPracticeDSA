// Last updated: 8/11/2026, 1:50:50 PM
1class Solution {
2    public long maximumMedianSum(int[] nums) {
3        Arrays.sort(nums);
4        int n=nums.length;
5        long Sum=0;
6        for(int i=n/3;i<n;i+=2){
7            Sum+=nums[i];
8        }
9        return Sum;
10    }
11}