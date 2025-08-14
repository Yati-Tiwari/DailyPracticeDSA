// Last updated: 8/14/2025, 11:24:02 AM
class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int distinct_count=1;
        for(int i=n-2;i>=0;i--){
           if(nums[i]!=nums[i+1]){
            distinct_count++;
           }
            if(distinct_count==3){
               return nums[i];
            }
        }
        return nums[n-1];
    }
}