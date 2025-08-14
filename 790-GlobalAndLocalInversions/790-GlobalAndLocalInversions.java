// Last updated: 8/14/2025, 11:22:03 AM
class Solution {
    public boolean isIdealPermutation(int[] nums) {
        for (int i=0; i < nums.length; i++) {
            if (Math.abs(nums[i] - i) > 1) {
                return false;
            }
        }
        return true;
    }
}

// class Solution {
//     public boolean isIdealPermutation(int[] nums) {
//         int global_count=0;
//         int local_count=0;
//         for(int i=0;i<nums.length-1;i++){
//             if(nums[i]>nums[i+1]){
//                 local_count++;
//             }
//         }
//         for(int i=0;i<nums.length;i++){
//             for(int j=i+1;j<nums.length;j++){
//                 if(nums[i]>nums[j]){
//                     global_count++;
//                 }
//             }
//         }
//         return global_count==local_count;

//     }
// }