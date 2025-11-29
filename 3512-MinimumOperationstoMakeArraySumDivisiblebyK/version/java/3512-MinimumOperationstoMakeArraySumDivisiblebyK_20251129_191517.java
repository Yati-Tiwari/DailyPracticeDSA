// Last updated: 11/29/2025, 7:15:17 PM
1class Solution {
2    public int minOperations(int[] nums, int k) {
3        int totalsum=0;
4        for(int i=0;i<nums.length;i++){
5            totalsum+=nums[i];
6        }
7        int ans=totalsum%k;
8        return ans;
9
10    }
11}