// Last updated: 8/8/2026, 8:03:47 PM
1class Solution {
2    public int missingNumber(int[] nums) {
3        Arrays.sort(nums);
4        int ans=0;
5        for(int i=0;i<nums.length;i++){
6            if(nums[i]!=i){
7                return i;
8            }else{
9                ans++;
10            }
11        }
12        return ans;
13        
14    }
15}