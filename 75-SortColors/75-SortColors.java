// Last updated: 8/14/2025, 11:26:34 AM
class Solution {
    public void sortColors(int[] nums) {
    sort(nums);
		for(int i=0;i<nums.length;i++) {
			System.out.print(nums[i]);
		}
	}
	public static int min(int[] nums,int index) {
		int min=index;
		for(int i=index+1;i<nums.length;i++) {
			if(nums[i]<nums[min]) {
				min=i;
			}
		}
		return min;
	}
			public static void sort(int[] nums) {
				for(int i=0;i<nums.length;i++) {
					int idx=min(nums,i);
					int temp=nums[i];
					nums[i]=nums[idx];
					nums[idx]=temp;
					
				}
			}
}
