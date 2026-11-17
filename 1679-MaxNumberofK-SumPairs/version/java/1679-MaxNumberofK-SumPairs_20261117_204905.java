// Last updated: 11/17/2026, 8:49:05 PM
1class Solution {
2    public int maxOperations(int[] nums, int k) {
3        Arrays.sort(nums);
4        int count=0;
5        int left=0;
6        int right=nums.length-1;
7        while(left<right){
8            int sum=nums[left]+nums[right];
9            if(sum==k){
10                count++;
11                left++;
12                right--;
13            }
14            else if(sum<k){
15                left++;
16            }
17            else{
18                right--;
19            }
20        }
21        return count;
22
23    }
24}