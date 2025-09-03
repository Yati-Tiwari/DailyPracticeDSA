// Last updated: 9/3/2025, 11:33:23 AM
class Solution {
    public int rob(int[] nums) {
        int[] dp=new int[nums.length];
		Arrays.fill(dp,-1);
		return Robber(nums,0,dp);
	}
	public static int Robber(int[] nums,int i,int[] dp) {
		if(i >=nums.length) {
			return 0;
		}
		if(dp[i] !=-1) {
			return dp[i];
		}
		int rob=nums[i]+Robber(nums,i+2,dp);
		int Dont_rob=Robber(nums,i+1,dp);
		return dp[i]=Math.max(rob,Dont_rob);
	}

}































 //     int n = nums.length;
    //     if (n == 0){
    //          return 0;
    //     }
    //     if (n == 1) {
    //         return nums[0];
    //     }

    //     int[] dp = new int[n];
    //     dp[0] = nums[0];
    //     dp[1] = Math.max(nums[0], nums[1]);

    //     for (int i = 2; i < n; i++) {
    //         dp[i] = Math.max(dp[i - 1], nums[i] + dp[i - 2]);
    //     }
    //     return dp[n - 1];
    // }