// Last updated: 8/14/2025, 11:21:34 AM
public class Solution {
    public int smallestRangeI(int[] nums, int k) {
        int minNum = Integer.MAX_VALUE;
        int maxNum = Integer.MIN_VALUE;
        for (int num : nums) {
            minNum = Math.min(minNum, num);
            maxNum = Math.max(maxNum, num);
        }
        return Math.max(0, maxNum - minNum - 2 * k);
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1, 3, 6};
        int k = 3;
        System.out.println(solution.smallestRangeI(nums, k)); 
    }
}
