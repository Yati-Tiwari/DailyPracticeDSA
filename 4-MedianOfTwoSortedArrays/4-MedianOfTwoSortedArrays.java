// Last updated: 8/14/2025, 11:27:38 AM

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int[] nums = new int[m + n];
        for (int i = 0; i < m; i++) {
            nums[i] = nums1[i];
        }
        for (int j = 0; j < n; j++) {
            nums[m + j] = nums2[j];
        }
        Arrays.sort(nums);
        if (nums.length % 2 == 0) {
            return (nums[nums.length / 2 - 1] + nums[nums.length / 2]) / 2.0;
        } else {
            return nums[nums.length / 2];
        }
    }
}
