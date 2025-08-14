// Last updated: 8/14/2025, 11:16:43 AM
class Solution {
    public int subarraySum(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            int s=Math.max(0,i-nums[i]);
            for(int j=s;j<=i;j++){
                 sum+=nums[j];
            }
        }
        return sum;
    }
   
    
}