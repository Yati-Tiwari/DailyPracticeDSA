// Last updated: 12/12/2025, 8:26:46 PM
1class Solution {
2    public boolean containsNearbyDuplicate(int[] nums, int k) {
3        for(int i=0;i<nums.length;i++){
4            for(int j=i+1;j<=i+k && j<nums.length;j++){
5                if(nums[i]==nums[j]){
6                    return true;
7                }
8            }
9        }
10         return false;
11    }
12}