// Last updated: 8/14/2025, 11:27:03 AM
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
