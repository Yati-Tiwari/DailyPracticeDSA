// Last updated: 8/14/2025, 11:25:59 AM
import java.util.Arrays;

public class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        Arrays.sort(nums);
        int maxSequence = 1;
        int currentSequence = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                if (nums[i] == nums[i - 1] + 1) {
                    currentSequence++;
                } else {
                    maxSequence = Math.max(maxSequence, currentSequence);
                    currentSequence = 1;
                }
            }
        }
        return Math.max(maxSequence, currentSequence);
    }
}
