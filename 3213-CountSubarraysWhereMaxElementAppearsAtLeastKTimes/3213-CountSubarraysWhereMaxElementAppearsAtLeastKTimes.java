// Last updated: 8/14/2025, 11:17:26 AM
class Solution {
    public long countSubarrays(int[] nums, int k) {
        int n=nums.length;
        int MAX=0;
        for (int i=0;i<n;i++) {
            if (nums[i] > MAX) {
                MAX=nums[i];
            }
        }
        long ANS=0;
        int Count=0;
        int left=0;
        for (int right=0; right <n;right++) {
            if (nums[right]==MAX) {
                Count++;
            }
            while (Count >= k) {
                if (nums[left]==MAX) {
                    Count--;
                }
                left++;
            }
           ANS+=left;
        }
        return ANS;
    }
}
