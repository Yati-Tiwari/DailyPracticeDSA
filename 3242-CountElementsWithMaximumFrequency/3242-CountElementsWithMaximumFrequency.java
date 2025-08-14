// Last updated: 8/14/2025, 11:17:21 AM
class Solution {
    public int maxFrequencyElements(int[] nums) {
        int[] freq=new int[101];  
        for (int i=0; i < nums.length; i++) {
            freq[nums[i]]++;
        }
        int maxFreq=0;
        for (int i=1; i <= 100; i++) {
            if (freq[i] > maxFreq) {
                maxFreq=freq[i];
            }
        }
        int count=0;
        for (int i=1; i <= 100; i++) {
            if (freq[i]==maxFreq) {
                count += freq[i];
            }
        }
        return count;
    }
}
