// Last updated: 8/14/2025, 11:16:29 AM
class Solution {
    public int minRemoval(int[] nums, int k) {
        Arrays.sort(nums);
        int g=nums.length;
        int ans=0;
        int q=0;
        for (int i=0; i < g; i++) {
            while ((long) nums[i] > (long) nums[q] * k) {
                q++;
            }
            int clth = i-q+2-1;
            if (clth > ans) {
                ans=clth;
            }
        }
        int Res=g - ans;
        return Res;
    }
}
