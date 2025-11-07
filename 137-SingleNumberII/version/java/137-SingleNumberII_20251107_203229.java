// Last updated: 11/7/2025, 8:32:29 PM
class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i += 3) {
            if (i + 1 >= nums.length || nums[i] != nums[i + 1]) {
                return nums[i];
            }
        }
        return nums[nums.length - 1];
    }
}