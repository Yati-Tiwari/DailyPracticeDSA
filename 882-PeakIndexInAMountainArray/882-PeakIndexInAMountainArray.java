// Last updated: 8/14/2025, 11:21:45 AM
public class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] < arr[mid + 1]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }   
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.peakIndexInMountainArray
        (new int[]{0, 2, 1, 0}));
        System.out.println(solution.peakIndexInMountainArray
        (new int[]{0, 10, 5, 2}));
        System.out.println(solution.peakIndexInMountainArray
        (new int[]{3, 4, 5, 1}));
    }
}
