// Last updated: 4/15/2026, 2:36:24 PM
1public class Solution {
2    public int maxSumDivThree(int[] nums) {
3        int[] dp=new int[3]; 
4        for (int i=0;i< nums.length;i++) {
5            int num=nums[i];
6            int[] temp=new int[3];
7            for (int j=0;j<3;j++) {
8                temp[j]=dp[j];
9            }
10            for (int j = 0;j < 3;j++) {
11                int sum=temp[j] + num;
12                int rem=sum % 3;
13                dp[rem]=Math.max(dp[rem],sum);
14            }
15        }
16        return dp[0]; 
17    }
18}
19