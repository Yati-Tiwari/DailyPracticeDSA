// Last updated: 8/14/2025, 11:25:00 AM
class Solution {
    public int[] productExceptSelf(int[] nums) {
        return product(nums);
    }
    public static int[] product(int[] arr) {
		int n=arr.length;
		int[] left=new int[n];
		left[0]=1;
		for(int i=1;i<n;i++)
		{
			left[i]=left[i-1]*arr[i-1];
		}
		int[] right=new int[n];
		right[n-1]=1;
		for(int i=n-2;i>=0;i--)
		{
			right[i]=right[i+1]*arr[i+1];
		}
		int[] ans=new int[n];
		for(int i=0;i<n;i++) {
			ans[i]=right[i]*left[i];
		}
		return ans;
	}

}

