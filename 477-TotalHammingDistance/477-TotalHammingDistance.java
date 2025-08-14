// Last updated: 8/14/2025, 11:23:37 AM
class Solution {
    public int totalHammingDistance(int[] nums) {
        int TotalDistance = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                TotalDistance += Integer.bitCount(nums[i] ^ nums[j]);
            }
        }     
        return TotalDistance;
    }
}
