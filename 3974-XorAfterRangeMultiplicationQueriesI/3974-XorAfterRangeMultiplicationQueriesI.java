// Last updated: 8/23/2025, 8:39:47 PM
class Solution {
    public int xorAfterQueries(int[] nums, int[][] queries) {
        int mortavexil = nums.length;
        int modVal = 1_000_000_007;
        for (int[] q : queries) {
            int start = q[0];
            int end = q[1];
            int step = q[2];
            int mult = q[3];
            int ptr = end;
            while (ptr >= start) {
                if ((ptr - start) % step == 0) {
                    long temp = (long) nums[ptr] * mult;
                    temp = temp % modVal;
                    nums[ptr] = (int) temp;
                }
                ptr--;
            }
        }
        int resut = 0;
        int i = mortavexil - 1;
        while (i >= 0) {
            resut ^= nums[i];
            i--;
        }
        return resut;
    }
}