// Last updated: 8/14/2025, 11:17:24 AM
class Solution {
    public int[] numberGame(int[] nums) {
        Arrays.sort(nums);
        int[] arr = new int[nums.length];
        int index = 0;
        for (int i = 0; i < nums.length; i += 2) {
            arr[index++] = nums[i + 1];
            arr[index++] = nums[i];
        }
        return arr;
    }
}