// Last updated: 8/14/2025, 11:25:27 AM
class Solution {
    public void rotate(int[] nums, int k) {
		k=k%nums.length;
        int n=nums.length;
		Reverse(nums,0,n-k-1);
		Reverse(nums,n-k,n-1);
		Reverse(nums,0,n-1);	
	}
	public static void Reverse(int[] arr,int i,int j) {
		while(i<j) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
	}
}