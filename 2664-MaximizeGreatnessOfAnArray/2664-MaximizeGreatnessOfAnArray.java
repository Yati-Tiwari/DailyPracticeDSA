// Last updated: 8/14/2025, 11:17:58 AM
class Solution {
    public int maximizeGreatness(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int i=0;
        int count=0;
        for(int j=0;j<n;j++){
            if(nums[j]>nums[i]){
                count++;
                i++;
            }
        }
        // while(j<n){
        //     if(nums[j]>nums[i]){
        //         count++;
        //         i++;
        //     }
        //     j++;
        // }
        return count;
    }
}