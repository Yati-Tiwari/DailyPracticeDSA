// Last updated: 8/14/2025, 11:17:01 AM
class Solution {
    public int minOperations(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length-2;i++){
            if(nums[i]==0){
                nums[i]=1;
                nums[i+1]^=1;
                nums[i+2]^=1;
                count++;
            }
        }
        if(nums[nums.length-1]==0 || nums[nums.length-2]==0){
                return -1;
            }
            return count;
    }
}