// Last updated: 8/14/2025, 11:27:17 AM
class Solution {
    public void nextPermutation(int[] nums) {
        nextGreatestValue(nums);
    }
    public static void nextGreatestValue(int[] arr) {
        int p = -1;
        int n = arr.length;
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] < arr[i + 1]) {
                p = i;
                break;
            }
        }
        if (p == -1) {
            reverse(arr, 0, n - 1);
            return;
        }
        int q = -1;
        for (int i = n - 1; i > p; i--) {
            if (arr[i] > arr[p]) {
                q = i;
                break;
            }
        }
        int temp = arr[p];
        arr[p] = arr[q];
        arr[q] = temp;
        reverse(arr, p + 1, n - 1);
    }
    public static void reverse(int[] nums, int j, int k) {
        while (j < k) {
            int temp = nums[j];
            nums[j] = nums[k];
            nums[k] = temp;
            j++;
            k--;
        }
    }
}
