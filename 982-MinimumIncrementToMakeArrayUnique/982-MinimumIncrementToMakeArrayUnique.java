// Last updated: 8/14/2025, 11:21:17 AM
class Solution {
    public int minIncrementForUnique(int[] nums) {
        Arrays.sort(nums);
        int Increments=0;
        for (int i=1; i < nums.length; i++) {
            if (nums[i] <= nums[i - 1]) {
                int needed = nums[i-1] + 1 - nums[i];
                nums[i]=nums[i-1] + 1;
                Increments += needed;
            }
        }
        return Increments;
    }
}
