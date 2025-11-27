// Last updated: 11/27/2025, 12:04:57 PM
1class Solution {
2    public int singleNumber(int[] nums) {
3        int a=0;
4        for(int i=0;i<nums.length;i++){
5            a=a^nums[i];
6        }
7        return a;
8    }
9}