// Last updated: 8/14/2025, 11:16:27 AM
class Solution {
    public int minOperations(int[] nums, int k) {
        int totalsum=0;
        for(int i=0;i<nums.length;i++){
            totalsum+=nums[i];
        }
        int ans=totalsum%k;
        return ans;

    }
}