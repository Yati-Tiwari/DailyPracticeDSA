// Last updated: 8/14/2025, 11:22:47 AM
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double SUM=0;
        for(int i=0;i<k;i++){
            SUM+=nums[i];
        }
        double n=nums.length;
        double max_Sum=SUM;
        for(int i=k;i<n;i++){
            SUM=SUM-nums[i-k]+nums[i];
            max_Sum=Math.max(SUM,max_Sum);
        }
        return max_Sum/k;
    }
}