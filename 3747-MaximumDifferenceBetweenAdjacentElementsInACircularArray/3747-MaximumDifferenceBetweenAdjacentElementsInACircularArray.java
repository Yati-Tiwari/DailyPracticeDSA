// Last updated: 8/14/2025, 11:16:40 AM
class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int n=nums.length;
        int answer=Math.abs(nums[0] - nums[n-1]);
        for (int i=1;i<n;i++) {
            answer = Math.max(answer, Math.abs(nums[i] - nums[i-1]));
        }
        return answer;
    }
}
