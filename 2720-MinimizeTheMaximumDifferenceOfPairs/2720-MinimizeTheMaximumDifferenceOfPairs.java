// Last updated: 8/14/2025, 11:17:48 AM
class Solution {
    public int minimizeMax(int[] nums, int p) {
        Arrays.sort(nums);
        int low=0;
        int high = nums[nums.length-1] - nums[0];
        int ans=high;
        while (low <=high) {
            int mid=low + (high - low) / 2;
            int count=0;
            for (int i=1; i < nums.length;) {
                if (nums[i] - nums[i-1] <= mid) {
                    count++;
                    i += 2;
                } else {
                    i++; 
                }
            }
            if (count >= p) {
                ans=mid;
                high=mid-1;
            } else {
                low = mid+1;
            }
        }
        return ans;
    }
}
