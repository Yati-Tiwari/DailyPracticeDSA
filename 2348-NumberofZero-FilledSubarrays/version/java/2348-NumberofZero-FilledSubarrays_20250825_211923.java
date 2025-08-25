// Last updated: 8/25/2025, 9:19:23 PM
class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long ans=0;
        long count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                count++;
                ans+=count;
            }else{
                count=0;
            }
        }
        return ans;
    }
}