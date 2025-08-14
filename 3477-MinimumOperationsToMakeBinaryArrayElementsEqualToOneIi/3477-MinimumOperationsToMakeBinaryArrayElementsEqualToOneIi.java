// Last updated: 8/14/2025, 11:17:00 AM
public class Solution {
    public int minOperations(int[] nums) {
        int operations=0;
        boolean flipped=false;
        for (int i=0;i<nums.length;i++) {
            if ((nums[i]==0&&!flipped)||(nums[i]==1&&flipped)) {
                operations++;
                flipped=!flipped;
            }
        }
        return operations;
    }
}
