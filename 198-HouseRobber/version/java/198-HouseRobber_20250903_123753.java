// Last updated: 9/3/2025, 12:37:53 PM
class Solution {
    public int lengthOfLIS(int[] nums) {
		int[] dp=new int[nums.length];
		Arrays.fill(dp,1);
		for(int i=1;i<dp.length;i++) {
			for(int j=i-1;j>=0;j--) {
				if(nums[i] > nums[j]) {
					int x=dp[j];
					dp[i]=Math.max(dp[i], x+1);
				}
			}
			
		}
		return Arrays.stream(dp).max().getAsInt();
	}

}












































































//  if (nums.length == 0) 
//         {
//             return 0;
//         }     
//         int n=nums.length;
//         int[] dp=new int[n];
//         for (int i=0;i<n;i++) {
//             dp[i] = 1;
//         }       
//         int Max_Length=1;        
//         for (int i=1;i<n;i++) {
//             for (int j=0;j<i;j++) {
//                 if (nums[i] > nums[j]) {
//                     dp[i]=Math.max(dp[i], dp[j]+1);
//                 }
//             }
//             if (dp[i] > Max_Length) {
//                 Max_Length=dp[i];
//             }
//         }     
//         return Max_Length;
//     }
