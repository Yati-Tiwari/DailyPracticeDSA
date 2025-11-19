// Last updated: 11/19/2025, 3:34:17 PM
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