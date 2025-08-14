// Last updated: 8/14/2025, 11:23:42 AM
class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int moves=0;
        int median=nums[nums.length/2];
        for(int i=0;i<nums.length;i++){
            moves+=Math.abs(nums[i]-median);
        }
        return moves;
    }
}