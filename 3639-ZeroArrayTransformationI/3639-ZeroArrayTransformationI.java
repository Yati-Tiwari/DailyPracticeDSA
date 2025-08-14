// Last updated: 8/14/2025, 11:16:49 AM
class Solution {
    public boolean isZeroArray(int[] nums, int[][] queries) {
        int n=nums.length;
        int[] D=new int[n + 1];
        for (int i = 0;i < queries.length;i++) {
            int l=queries[i][0];
            int r=queries[i][1];
            D[l]++;
            if (r+1 < n) {
                D[r+1]--;
            }
        }
        int Decrement= 0;
        for (int i = 0; i < n;i++) {
            Decrement += D[i];
            if (nums[i] > Decrement) {
                return false;
            }
        }
        return true;
    }
}
