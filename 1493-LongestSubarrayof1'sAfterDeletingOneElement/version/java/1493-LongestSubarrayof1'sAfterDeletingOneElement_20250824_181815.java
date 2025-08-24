// Last updated: 8/24/2025, 6:18:15 PM
class Solution {
    public int longestSubarray(int[] nums) {
        int left=0;
        int Zero_Count=0;
        int maximum_Len=0;
        for (int right=0; right < nums.length; right++) {
            if (nums[right]==0) {
                Zero_Count++;
            }
            while (Zero_Count > 1) {
                if (nums[left]==0) {
                    Zero_Count--;
                }
                left++;
            }
            maximum_Len=Math.max(maximum_Len, right-left);
        }
        return maximum_Len;
    }
}
