// Last updated: 8/5/2026, 8:40:01 PM
1class Solution {
2    public int maxSubArray(int[] nums) {
3        int Max=Integer.MIN_VALUE;
4        int sum=0;
5        for(int i=0;i<nums.length;i++){
6            sum+=nums[i];
7            Max=Math.max(sum,Max);
8            if(sum<0){
9                sum=0;
10            }
11        }
12        return Max;
13
14    }
15}