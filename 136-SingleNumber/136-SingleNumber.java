// Last updated: 8/14/2025, 11:25:51 AM
public class Solution {
    public int singleNumber(int[] nums) {
        int ans = 0; 
        for (int num : nums) {
            ans ^= num; 
        }
        return ans; 
    }
}
