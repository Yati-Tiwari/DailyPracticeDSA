// Last updated: 12/14/2025, 8:50:23 AM
1class Solution {
2    public int absDifference(int[] nums, int k) {
3        Arrays.sort(nums);
4        int Smallsum1=0;
5        for(int i=0;i<k;i++){
6            Smallsum1+=nums[i];
7        }
8        int Bigsum2=0;
9        for(int i=nums.length-1;i>=nums.length-k;i--){
10            Bigsum2+=nums[i];
11        }
12        return Math.abs(Bigsum2-Smallsum1);
13    }
14}