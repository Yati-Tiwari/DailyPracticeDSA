// Last updated: 8/8/2026, 8:24:43 PM
1class Solution {
2    public int thirdMax(int[] nums) {
3        Arrays.sort(nums);
4        int distinct_count=1;
5        for(int i=nums.length-2;i>=0;i--){
6            if(nums[i]!=nums[i+1]){
7                distinct_count++;
8            }if(distinct_count==3){
9                return nums[i];
10            }
11        }
12        return nums[nums.length-1];
13    }
14}