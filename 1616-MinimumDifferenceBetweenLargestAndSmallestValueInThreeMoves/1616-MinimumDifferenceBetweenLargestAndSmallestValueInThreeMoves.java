// Last updated: 8/14/2025, 11:19:56 AM
class Solution {
    public int minDifference(int[] nums) {
        int n=nums.length;
        if (n<=4) {
            return 0;  
        }
        Arrays.sort(nums);
        int Result=Integer.MAX_VALUE;
        for (int i=0; i <= 3; i++) {
            int difference=nums[n-4 + i] - nums[i];
            Result=Math.min(Result, difference);
        }
        return Result;
    }
        
}
