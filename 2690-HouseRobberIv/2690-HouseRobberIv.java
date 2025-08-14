// Last updated: 8/14/2025, 11:17:55 AM
class Solution {
    public int minCapability(int[] nums, int k) {
        int left = Integer.MAX_VALUE;
        int right = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < left) {
                left = nums[i]; 
            }
            if (nums[i] > right) {
                right = nums[i]; 
            }
        }
        while (left < right) {
            int mid = left + (right - left) / 2;
            int count = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] <= mid) {
                    count++;
                    i++; 
                }
            }
            if (count >= k) {
                right = mid;  
            } else {
                left = mid + 1;  
            }
        }
        return left;
    }
}