// Last updated: 8/14/2025, 11:17:38 AM
class Solution {
    public int findValueOfPartition(int[] nums) {
        Arrays.sort(nums);
        int min=Integer.MAX_VALUE;
        for (int i=1; i < nums.length; i++) {
            int diff = nums[i]-nums[i - 1];
            if (diff < min) {
                min=diff;
            }
        }
        return min;
    }
}
