// Last updated: 8/14/2025, 11:24:49 AM
class Solution {
    public void moveZeroes(int[] nums) {
        int lastNonZeroIndex = 0; 
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[lastNonZeroIndex] = nums[i];
                lastNonZeroIndex++;
            }
        }
        for (int i = lastNonZeroIndex; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}
