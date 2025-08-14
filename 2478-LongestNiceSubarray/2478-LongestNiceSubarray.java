// Last updated: 8/14/2025, 11:18:24 AM
class Solution {
    public int longestNiceSubarray(int[] nums) {
        int l=0;
        int r=0;
        int ans=1;
        int bit=0;
        while(r<nums.length){
            while((bit & nums[r]) !=0){
                bit^=nums[l++];              
            }
            bit |=nums[r];
            ans=Math.max(ans,r-l+1);
            r++;
        }
        return ans;
    }
}