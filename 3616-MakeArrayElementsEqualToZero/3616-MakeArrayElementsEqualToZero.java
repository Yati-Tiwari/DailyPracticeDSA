// Last updated: 8/14/2025, 11:16:55 AM
public class Solution {
    public int countValidSelections(int[] nums) {
        int totalSum = 0;
        for (int n : nums) {
            totalSum += n;
        }
        int validSelections = 0;
        int prefixSum = 0;
        for (int n : nums) {
            if (n != 0) {
                prefixSum += n;
            } else {
                int suffixSum = totalSum - prefixSum;
                if (prefixSum == suffixSum) {
                    validSelections += 2; 
                } else if (Math.abs(prefixSum - suffixSum) == 1) {
                    validSelections += 1;
                }
            }
        }

        return validSelections;
    }
}
