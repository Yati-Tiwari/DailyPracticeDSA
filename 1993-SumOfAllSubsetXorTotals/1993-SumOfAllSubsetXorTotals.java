// Last updated: 8/14/2025, 11:19:13 AM
class Solution {
    public int subsetXORSum(int[] nums) {
        int ans=0;
        for(int num:nums){
            ans|=num;
        }
        return ans*(int) Math.pow(2,nums.length-1);
    }
}