// Last updated: 9/22/2025, 6:17:44 AM
class Solution {
    public long maxTotalValue(int[] nums, int k) {
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            max=Math.max(max,nums[i]);
            min=Math.min(min,nums[i]);
        }
        long result=(long)max-min;
        long answer=result * k;
        return answer;
    }
}