// Last updated: 3/30/2026, 2:41:36 PM
1class Solution {
2    public void sortColors(int[] nums) {
3    sort(nums);
4		for(int i=0;i<nums.length;i++) {
5			System.out.print(nums[i]);
6		}
7	}
8	public static int min(int[] nums,int index) {
9		int min=index;
10		for(int i=index+1;i<nums.length;i++) {
11			if(nums[i]<nums[min]) {
12				min=i;
13			}
14		}
15		return min;
16	}
17			public static void sort(int[] nums) {
18				for(int i=0;i<nums.length;i++) {
19					int idx=min(nums,i);
20					int temp=nums[i];
21					nums[i]=nums[idx];
22					nums[idx]=temp;
23					
24				}
25			}
26}