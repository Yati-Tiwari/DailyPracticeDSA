// Last updated: 8/14/2025, 11:24:13 AM
class Solution {
    public int maxRotateFunction(int[] nums) {
        int N=nums.length;
        int Total_Sum = 0;
        int FA=0;
        for (int i = 0; i < N; i++) {
            Total_Sum += nums[i];
            FA += i * nums[i];
        }
        int Max = FA;
        for (int i = N-1; i >= 1; i--) {
            FA = FA + Total_Sum - N * nums[i];
            Max = Math.max(Max, FA);
        }
        return Max;
    }
}
