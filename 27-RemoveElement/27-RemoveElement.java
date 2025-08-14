// Last updated: 8/14/2025, 11:27:21 AM
class Solution {
    public int removeElement(int[] nums, int val) {
       int index=0;
       for(int i=0;i<nums.length;i++){
        if(nums[i]!=val){
            nums[index]=nums[i];
            index++;
        }
       }
       return index;
    }
}