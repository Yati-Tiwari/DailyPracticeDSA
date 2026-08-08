// Last updated: 8/8/2026, 8:10:45 PM
1class Solution {
2    public void moveZeroes(int[] nums) {
3        int lastIndex=0;
4        for(int i=0;i<nums.length;i++){
5            if(nums[i]!=0){
6                nums[lastIndex]=nums[i];
7                lastIndex++;
8            }
9        }
10        for(int i=lastIndex;i<nums.length;i++){
11            nums[i]=0;
12        }
13           
14    }
15}