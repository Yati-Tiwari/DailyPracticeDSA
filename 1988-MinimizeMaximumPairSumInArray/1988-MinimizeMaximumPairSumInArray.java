// Last updated: 8/14/2025, 11:19:14 AM
class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int Maximum_PairSum=0;
        for (int i=0;i< n/2;i++) {
            Maximum_PairSum= Math.max(Maximum_PairSum,nums[i] + nums[n-1-i]);
        }
        return Maximum_PairSum;
    
    }
}