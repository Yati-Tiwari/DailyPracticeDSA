// Last updated: 8/14/2025, 11:27:13 AM
class Solution {
    public int searchInsert(int[] nums, int target) {
    //     for(int i=0;i<nums.length;i++){
    //         if(nums[i]>=target){
    //             return i;
    //         }
    //     }
    //     return nums.length;
    // }
    int lo=0;
    int hi=nums.length-1;
    while(lo<=hi){
        int mid=lo+(hi-lo)/2;
        if(nums[mid]==target){
            return mid;
        }
        else if(nums[mid]<=target){
            lo=mid+1;
        }
        else{
            hi=mid-1;
        }
    }
    return lo;
}
}