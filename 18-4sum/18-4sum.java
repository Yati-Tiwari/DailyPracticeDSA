// Last updated: 8/14/2025, 11:27:26 AM

class Solution {
    public List<List<Integer>> fourSum(int[] nums, long target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;

        for (int j = 0; j < n - 3; j++) {
            if (j > 0 && nums[j] == nums[j - 1]) {
                continue;
            }
            for (int i = j + 1; i < n - 2; i++) {
                if (i > j + 1 && nums[i] == nums[i - 1]) {
                    continue;
                }
                int left = i + 1;
                int right = n - 1;

                while (left < right) {
                    long sum = (long) nums[j] + (long) nums[i] + (long) nums[left] + (long) nums[right];
                    if (sum == target) {
                        result.add(Arrays.asList(nums[j], nums[i], nums[left], nums[right]));
                        while (left < right && nums[left] == nums[left + 1])
                            left++;
                        while (left < right && nums[right] == nums[right - 1])
                            right--;
                        left++;
                        right--;
                    } else if (sum < target) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
        }
        return result;
    }
}