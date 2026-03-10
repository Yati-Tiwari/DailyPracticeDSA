// Last updated: 3/10/2026, 10:43:31 AM
1class Solution {
2    public int longestOnes(int[] nums, int k) {
3        int left=0,right=0,count=0,max=Integer.MIN_VALUE;
4        for(int i=0;i<nums.length;i++){
5            if(nums[right]==0){
6                count++;
7            }
8            while(count>k){
9                if(nums[left]==0){
10                    count--;
11                }
12                left++;
13            }
14            max=Math.max(max,right-left+1);
15            right++;
16        }
17        return max;
18    }
19}