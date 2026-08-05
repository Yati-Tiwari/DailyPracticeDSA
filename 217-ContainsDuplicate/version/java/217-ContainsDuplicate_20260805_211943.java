// Last updated: 8/5/2026, 9:19:43 PM
1class Solution {
2    public boolean containsDuplicate(int[] nums) {
3        Arrays.sort(nums);
4        for(int i=1;i<nums.length;i++){
5            if(nums[i]==nums[i-1]){
6                return true;
7            }
8        }
9        return false;
10
11    }
12}