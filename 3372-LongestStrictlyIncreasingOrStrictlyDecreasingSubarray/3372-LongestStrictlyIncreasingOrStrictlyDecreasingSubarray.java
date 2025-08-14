// Last updated: 8/14/2025, 11:17:14 AM
class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        if(nums.length==1){
            return 1;
        }
        int maxlen=1;
        int incLen=1;
        int decLen=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[i-1]){
                incLen++;
                decLen=1;
            }
            else if(nums[i]<nums[i-1]){
                decLen++;
                incLen=1;
            }
            else{
                incLen=1;
                decLen=1;
            }
            maxlen=Math.max(maxlen,Math.max(incLen,decLen));

        }
        return maxlen;
    }
}