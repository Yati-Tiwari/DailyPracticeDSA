// Last updated: 8/14/2025, 11:17:07 AM
class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        Arrays.sort(nums);
        int ans=0;
        int n=nums.length;
        for(int i=0;i<n-1;i++){
            if(nums[i]==nums[i+1]){
                ans=ans^nums[i];
                i++;
            }
        }
        return ans;
    }
}