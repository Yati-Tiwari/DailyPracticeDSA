// Last updated: 8/14/2025, 11:17:12 AM
class Solution {
    public long countAlternatingSubarrays(int[] nums) {     
        long total=1; 
        long count=1;
        for (int i=1;i <nums.length;i++) {
            if (nums[i] != nums[i-1]) {
                count++;
            } else {
                count=1;
            }
            total +=count;
        }
        return total;
    }
}