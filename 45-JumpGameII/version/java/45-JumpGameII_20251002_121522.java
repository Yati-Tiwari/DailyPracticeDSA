// Last updated: 10/2/2025, 12:15:22 PM
class Solution {
    public int jump(int[] nums) {
        int jumps = 0;
        int CurrentEnd = 0;
        int Farthest = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            Farthest = Math.max(Farthest, i + nums[i]);
            if (i == CurrentEnd) {
                jumps++;
                CurrentEnd = Farthest;
                if (CurrentEnd >= nums.length - 1) {
                    break;
                }
            }
        }

        return jumps;
    }
}