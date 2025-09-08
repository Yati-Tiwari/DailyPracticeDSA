// Last updated: 9/8/2025, 10:50:54 AM
class Solution {
    public int maximumXOR(int[] nums) {
        int ans=0;
        for(int i=0;i<nums.length;i++){
            ans=ans|nums[i];
        }
        return ans;
    }
}