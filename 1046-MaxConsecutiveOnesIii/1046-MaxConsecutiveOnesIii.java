// Last updated: 8/14/2025, 11:20:59 AM
class Solution {
    public int longestOnes(int[] nums, int k) {
        int start=0;
        int End=0;
        int Count=0;
        int Max=Integer.MIN_VALUE;
        while(End<nums.length){
            if(nums[End]==0){
                Count++;
            }
            while(Count>k){
                if(nums[start]==0){
                    Count--;
                }
                start++;
            }
            Max=Math.max(Max,End-start+1);
            End++;
        }
        return Max;


    }
}