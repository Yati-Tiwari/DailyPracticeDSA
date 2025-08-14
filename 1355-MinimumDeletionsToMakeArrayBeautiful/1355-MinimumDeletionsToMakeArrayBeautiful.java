// Last updated: 8/14/2025, 11:20:22 AM
class Solution {
    public int minDeletion(int[] nums) {
        int Deletions=0;
        for (int i=0; i < nums.length-1; i++) {
            if ((i-Deletions) % 2 ==0 && nums[i] == nums[i+1]) {
                Deletions++;
            }
        }
        if ((nums.length-Deletions) % 2 != 0) {
            Deletions++;
        }
        return Deletions;
    }
}
