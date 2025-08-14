// Last updated: 8/14/2025, 11:18:06 AM
class Solution {
    public long minOperations(int[] nums1, int[] nums2, int k) {
        if (k == 0) {
            if (Arrays.equals(nums1, nums2)) {
                return 0;
            }
            return -1;
        }
        long TotalDiff = 0;
        long TotalOps = 0;
        for (int i = 0; i < nums1.length; i++) {
            int diff = nums1[i] - nums2[i];
            if (diff % k != 0) {
                return -1;
            }
            TotalDiff += diff;
            TotalOps += Math.abs(diff / k);
        }

        if (TotalDiff == 0) {
            return TotalOps / 2;
        }
        return -1;
    }
}
