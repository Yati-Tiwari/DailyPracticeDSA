// Last updated: 8/14/2025, 11:17:33 AM
class Solution {
    public long maximumTripletValue(int[] nums) {
        long maxValue=0;
        long maxDiff=0; 
        int maxNum=0;   
        for (int i =0;i<nums.length;i++) {
            maxValue=Math.max(maxValue,maxDiff *nums[i]); 
            maxDiff=Math.max(maxDiff,maxNum-nums[i]);           
            maxNum=Math.max(maxNum,nums[i]);                  
        }       
        return maxValue;
    }
}
