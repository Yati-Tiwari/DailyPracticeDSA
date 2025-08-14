// Last updated: 8/14/2025, 11:23:36 AM
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int Max_count=0;
        int current_count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                current_count++;
                Max_count=Math.max(current_count,Max_count);
            }
            else{
                current_count=0;
            }
        }
        return Max_count;
    }
}