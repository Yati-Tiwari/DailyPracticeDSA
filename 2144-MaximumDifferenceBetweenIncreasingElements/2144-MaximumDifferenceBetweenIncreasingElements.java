// Last updated: 8/14/2025, 11:19:07 AM
class Solution {
    public int maximumDifference(int[] nums) {
        int Min=nums[0];
        int MaxDiff=-1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>Min){
                MaxDiff=Math.max(nums[i]-Min,MaxDiff);
            }
            else{
                Min=nums[i];
            }
        }
        return MaxDiff;
    }
}