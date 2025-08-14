// Last updated: 8/14/2025, 11:17:36 AM
class Solution {
    public boolean isGood(int[] nums) {
        int n=nums.length-1;
        Arrays.sort(nums);
        for(int i=0;i<n;i++){
            if(nums[i]!=i+1){
                return false;
            }
        }
        return nums[n]==n  &&  nums[n-1]==n;
    }
}