// Last updated: 8/14/2025, 11:17:03 AM
class Solution {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        int left=0;
        int right=nums.length-1;
        double Min_Average=(nums[left]+nums[right])/2.0;
        while(left<right){
            double Average=(nums[left]+nums[right])/2.0;
            Min_Average=Math.min(Min_Average,Average);
            left++;
            right--;
        }
        return Min_Average;
    }

}