// Last updated: 8/14/2025, 11:20:16 AM
public class Solution {
    public int maxSumDivThree(int[] nums) {
        int[] dp=new int[3]; 
        for (int i=0;i< nums.length;i++) {
            int num=nums[i];
            int[] temp=new int[3];
            for (int j=0;j<3;j++) {
                temp[j]=dp[j];
            }
            for (int j = 0;j < 3;j++) {
                int sum=temp[j] + num;
                int rem=sum % 3;
                dp[rem]=Math.max(dp[rem],sum);
            }
        }
        return dp[0]; 
    }
}
