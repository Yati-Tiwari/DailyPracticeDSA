// Last updated: 4/13/2026, 7:33:48 PM
1class Solution {
2    public int getMinDistance(int[] nums, int target, int start) {
3        int mind=Integer.MAX_VALUE;
4        for(int i=0;i<nums.length;i++){
5            if(nums[i]==target){
6                int d=Math.abs(i-start);
7                mind=Math.min(d,mind);
8            }
9        }
10        return mind;
11    }
12}