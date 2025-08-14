// Last updated: 8/14/2025, 11:24:48 AM
class Solution {
    public int findDuplicate(int[] nums) {
        int low = 1, high = nums.length - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;
            int count = 0;

            for (int i = 0; i < nums.length; i++) {
                if (nums[i] <= mid) count++;
            }

            if (count > mid) 
            {
                high = mid;
                }
            else{ 
                low = mid + 1;
            }


        }

        return low;
    }
}
