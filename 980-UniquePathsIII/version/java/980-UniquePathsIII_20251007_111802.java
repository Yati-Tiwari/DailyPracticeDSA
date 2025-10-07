// Last updated: 10/7/2025, 11:18:02 AM
class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);  // sort the array
        int n = nums.length;
        int closestSum = nums[0] + nums[1] + nums[2];  // initial sum

        for (int i = 0; i < n - 2; i++) {
            int left = i + 1;
            int right = n - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                // Update closestSum if this sum is closer to target
                if (Math.abs(sum - target) < Math.abs(closestSum - target)) {
                    closestSum = sum;
                }

                if (sum < target) {
                    left++;  // need a bigger sum
                } else if (sum > target) {
                    right--; // need a smaller sum
                } else {
                    return sum; // exact match found
                }
            }
        }

        return closestSum;
    }
}
