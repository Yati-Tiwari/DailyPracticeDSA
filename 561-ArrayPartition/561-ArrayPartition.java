// Last updated: 8/14/2025, 11:23:11 AM
class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int Sum=0;
        for(int i=0;i<nums.length;i+=2){
            Sum+=nums[i];
        }
        return Sum;
    }
}