// Last updated: 7/26/2026, 5:54:47 PM
1public class Solution {
2    public int maximumProduct(int[] nums) {
3        Arrays.sort(nums);
4        int n=nums.length-1;
5        return Math.max(nums[0]*nums[1]*nums[n],nums[n]*nums[n-1]*nums[n-2]);
6    }
7}
8