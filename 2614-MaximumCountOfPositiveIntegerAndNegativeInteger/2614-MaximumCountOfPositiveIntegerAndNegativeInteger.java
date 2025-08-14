// Last updated: 8/14/2025, 11:18:04 AM
class Solution {
    public int maximumCount(int[] nums) {
        int positive_count=0;
        int negative_count=0;
        int ans=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                positive_count++;
            }
            else if(nums[i]<0){
                negative_count++;
            }
        }
        return ans+=Math.max(positive_count,negative_count);
    }
    
}