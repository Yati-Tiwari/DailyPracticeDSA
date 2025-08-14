// Last updated: 8/14/2025, 11:20:17 AM
public class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int n=nums.length;
        int[] freq=new int[n+1];
        freq[0]=1;
        int oddCount=0;
        int result=0;
        for (int i=0;i<n;i++) {
            if (nums[i]%2 != 0) {
                oddCount++;
            }
            if (oddCount>=k) {
                result+=freq[oddCount-k];
            }
            freq[oddCount]++;
        }
        return result;
    }
}
