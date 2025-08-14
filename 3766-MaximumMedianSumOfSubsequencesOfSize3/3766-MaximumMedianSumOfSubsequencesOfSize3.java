// Last updated: 8/14/2025, 11:16:37 AM
class Solution {
    public long maximumMedianSum(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        long Sum=0;
        for(int i=n/3;i<n;i+=2){
            Sum+=nums[i];
        }
        return Sum;
    }
}