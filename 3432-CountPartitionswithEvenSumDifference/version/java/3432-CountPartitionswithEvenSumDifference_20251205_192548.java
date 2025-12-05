// Last updated: 12/5/2025, 7:25:48 PM
1class Solution {
2    public int countPartitions(int[] nums) {
3        int totalSum = 0;
4        for (int num : nums) {
5            totalSum += num;
6        }
7        int leftSum = 0;
8        int count = 0;
9        for (int i = 0; i < nums.length - 1; i++) {
10            leftSum += nums[i]; 
11            int rightSum = totalSum - leftSum;
12            if ((leftSum - rightSum) % 2 == 0) {
13                count++;
14            }
15        }
16
17        return count; 
18    }
19}