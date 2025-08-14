// Last updated: 8/14/2025, 11:16:36 AM
class Solution {
    public int[] transformArray(int[] nums) {
       int count=0;
       for(int i=0;i<nums.length;i++){
        if(nums[i]%2==0){
            count++;
        }
       }
       int i=0;
       while(count>0 && i<nums.length){
        nums[i++]=0;
        count--;
       }
       while(i<nums.length){
        nums[i++]=1;
       }
       return nums;
    }
}
