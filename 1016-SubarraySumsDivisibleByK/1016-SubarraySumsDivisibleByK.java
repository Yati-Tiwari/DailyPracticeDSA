// Last updated: 8/14/2025, 11:21:12 AM
class Solution {
    public int subarraysDivByK(int[] nums, int k) {
		return Count_SubArray(nums,k);

	}
	public static int Count_SubArray(int[] nums,int k) {
        int n=nums.length;
		long[] freq=new long[k];
		long sum=0;
		freq[0]=1;
		for(int i=0;i<n;i++) {
			sum+=nums[i];
			int rem=(int) (sum%k);
			if(rem<0) {
				rem+=k;//if remainder comes -ve
			}
			freq[rem]++;
		}
		int ans=0;
		for(int i=0;i<freq.length;i++) {
			if(freq[i]>=2) {
				long x=freq[i];
				ans+=(x*(x-1))/2;
			}
		}
		return ans;
    }
}