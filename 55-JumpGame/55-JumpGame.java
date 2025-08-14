// Last updated: 8/14/2025, 11:26:54 AM
class Solution {
    public boolean canJump(int[] nums) {
        int Maxreach = 0; 
        for (int i = 0; i < nums.length; i++) {
            if (i > Maxreach) {
                return false; 
            }
            Maxreach = Math.max(Maxreach, i + nums[i]); 
            if (Maxreach >= nums.length - 1) {
                return true;
            }
        }
        return false; 
    }
}
