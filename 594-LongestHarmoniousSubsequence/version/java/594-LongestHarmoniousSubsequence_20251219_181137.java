// Last updated: 12/19/2025, 6:11:37 PM
1class Solution {
2    public int findLHS(int[] nums) {
3        Arrays.sort(nums);
4        int left=0;
5        int maxmLength=0;
6        for (int right=0;right<nums.length;right++) {
7            while (nums[right]-nums[left] >1) {
8                left++;
9            }
10            if (nums[right]-nums[left]==1) {
11                maxmLength=Math.max(maxmLength,right-left+1);
12            }
13        }
14        return maxmLength;
15    }
16}
17