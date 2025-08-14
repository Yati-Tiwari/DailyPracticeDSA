// Last updated: 8/14/2025, 11:18:13 AM
class Solution {
    public int longestSubarray(int[] nums) {
        int max=0;
        for (int i=0;i<nums.length;i++) {
            max = Math.max(max,nums[i]);
        }
        int maxLength=0;
        int currentLength=0;
        for (int i=0;i<nums.length;i++) {
            if (nums[i]==max) {
                currentLength++;
                maxLength = Math.max(maxLength, currentLength);
            } else {
                currentLength=0;
            }
        }
        return maxLength;
    }
}
