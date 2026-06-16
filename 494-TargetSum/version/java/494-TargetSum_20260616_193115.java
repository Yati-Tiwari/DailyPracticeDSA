// Last updated: 6/16/2026, 7:31:15 PM
1class Solution {
2    public int findTargetSumWays(int[] nums, int target) {
3        return ts(nums,target,0,0);
4    }
5    public static int ts(int[] nums,int target,int i,int sum){
6        if(i>=nums.length){
7            if(sum==target){
8                return 1;
9            }
10            return 0;
11        }
12        return ts(nums,target,i+1,nums[i]+sum)+ts(nums,target,i+1,sum-nums[i]);
13    }
14}
15