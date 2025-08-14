// Last updated: 8/14/2025, 11:26:55 AM
class Solution {
    public int maxSubArray(int[] nums) {
       return maximum_Sum(nums);
	}
	public static int maximum_Sum(int[] arr) {
		int ans=Integer.MIN_VALUE;
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
			ans=Math.max(ans, sum);
			if(sum<0) {
				sum=0;
			}
		}
		return ans;
	}
}