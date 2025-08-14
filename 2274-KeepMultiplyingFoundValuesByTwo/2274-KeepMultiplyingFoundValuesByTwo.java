// Last updated: 8/14/2025, 11:18:52 AM
class Solution {
    public int findFinalValue(int[] nums, int original) {
        Arrays.sort(nums);
        for(int num:nums){
            if(num==original){
                original*=2;
            }
        }
        return original;
    }
}