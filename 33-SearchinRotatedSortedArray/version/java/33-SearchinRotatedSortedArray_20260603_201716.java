// Last updated: 6/3/2026, 8:17:16 PM
1class Solution {
2    public int search(int[] nums, int target) {
3        int low=0;
4    	int high=nums.length-1;
5    	while(low<=high) {
6    		int mid=low+(high-low)/2;
7    		if(target==nums[mid]) {
8    			return mid;
9    		}
10    		else if(nums[mid]>=nums[low]){
11                if(nums[low]<=target&&target<nums[mid]){
12                    high=mid-1;
13                }
14                else{
15    			low=mid+1;
16                }
17
18    		}
19    		else {
20                if(target>nums[mid]&&target<=nums[high]){
21                    low=mid+1;
22                }
23                else{
24                    high=mid-1;
25                }
26            }
27    			
28    	}	
29    	return -1;
30
31    }
32    
33
34}