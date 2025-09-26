// Last updated: 9/26/2025, 9:52:06 PM
public class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result = {-1, -1}; // Initialize result to [-1, -1]
        if (nums == null || nums.length == 0) {
            return result; // Return if array is empty
        }
        result[0] = findFirstPosition(nums, target);
        if (result[0] != -1) {
            result[1] = findLastPosition(nums, target);
        }
        return result;
    }
    public static int findFirstPosition(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        int firstPosition = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                firstPosition = mid; 
                right = mid - 1; 
            } else if (nums[mid] < target) {
                left = mid + 1; 
            } else {
                right = mid - 1;
            }
        }
        return firstPosition; 
    }
    public static int findLastPosition(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        int lastPosition = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                lastPosition = mid; 
                left = mid + 1; 
            } else if (nums[mid] < target) {
                left = mid + 1; 
            } else {
                right = mid - 1; 
            }
        }
        return lastPosition; 
    }
}
