// Last updated: 8/14/2025, 11:25:13 AM
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int sum=0;
        int start=0;
        int end=0;
        int len=Integer.MAX_VALUE;
        while(end<nums.length){
            sum+=nums[end];
            while(sum>=target){
                if(end-start+1<len){
                    len=end-start+1;
                }
                sum=sum-nums[start];
                start++;
            }
            end++;
        }
        if(len!=Integer.MAX_VALUE){
            return len;
        }else{
            return 0;
        }
       
    }
}