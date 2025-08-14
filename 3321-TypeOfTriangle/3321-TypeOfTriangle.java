// Last updated: 8/14/2025, 11:17:16 AM
class Solution {
    public String triangleType(int[] nums) {
        if((nums[0]+nums[1]>nums[2] && (nums[1]+nums[2]>nums[0]) && nums[0]+nums[2]>nums[1])){
            if(nums[0]==nums[1] && nums[1]==nums[2]){
                return "equilateral";
            }
            else if(nums[0] != nums[1] && nums[1] != nums[2] && nums[0] != nums[2]){
                return "scalene";
            }
            else{
                return "isosceles";
            }
        }
        else{
                return "none";
            }
    }
}