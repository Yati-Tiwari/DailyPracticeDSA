// Last updated: 10/1/2025, 11:18:15 AM
class Solution {
    public boolean canJump(int[] nums) {
        int maxreach=0;
        for(int i=0;i<nums.length;i++){
            if(i > maxreach){
                return false;
            }
            maxreach=Math.max(maxreach,nums[i]+i);
        }
        return true;
    }

}