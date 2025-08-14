// Last updated: 8/14/2025, 11:22:35 AM
class Solution {
    public int findLengthOfLCIS(int[] nums) {
        if (nums.length==0) {
            return 0;
        }
        int MaxLen=1;
        int CurrLen=1;
        for (int i=1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                CurrLen++;
                MaxLen=Math.max(MaxLen, CurrLen);
            } else {
                CurrLen=1;
            }
        }
        return MaxLen;
    }
}
