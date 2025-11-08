// Last updated: 11/8/2025, 8:18:42 PM
class Solution {
    public int minMoves(int[] nums) {
        Arrays.sort(nums);
        int lth=nums.length;
        int ar=nums[lth-1];
        int moves=0;
        for(int i=lth-1;i>=0;i--){
            moves+=ar-nums[i];
        }
        return moves;
    }
}