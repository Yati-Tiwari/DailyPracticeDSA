// Last updated: 8/14/2025, 11:18:41 AM
class Solution {
    public long countSubarrays(int[] nums, long k) {
        int i=0;
        long Count=0;
        long Sum=0;
        for(int j=0;j<nums.length;j++){
            Sum+=nums[j];
            while(Sum*(j-i+1)>=k){
                Sum-=nums[i];
                i++;
            }
            Count+=(j-i+1);
        }
        return Count;

       
    }
}