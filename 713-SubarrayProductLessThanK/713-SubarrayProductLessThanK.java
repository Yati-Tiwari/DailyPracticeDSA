// Last updated: 8/14/2025, 11:22:30 AM
class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
     return Product_less_Than_K(nums,k);
	}
	public static int Product_less_Than_K(int[] nums,int K) {
		int ans=0;
		int si=0;
		int ei=0;
		int p=1;
		while(ei<nums.length) {
			// grow
			p=p*nums[ei];
			
			// shrink
			while(p>=K && si<=ei) {
				p=p/nums[si];
				si++;
			}
			// ans update
			ans=ans+(ei-si+1);
			ei++;		
		}
		return ans;
		
	}

}
