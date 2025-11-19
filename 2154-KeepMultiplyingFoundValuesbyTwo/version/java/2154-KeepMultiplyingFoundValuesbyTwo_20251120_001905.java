// Last updated: 11/20/2025, 12:19:05 AM
class Solution {
    public int findFinalValue(int[] nums, int original) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i]==original){
                original*=2;
            }
        }
        return original;
    }
}