// Last updated: 10/7/2025, 11:52:13 AM
class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        int n = capacity.length;
        int[] need = new int[n];

        // Step 1: Find how many rocks each bag still needs
        for (int i = 0; i < n; i++) {
            need[i] = capacity[i] - rocks[i];
        }

        // Step 2: Sort the need array
        Arrays.sort(need);
        // Step 3: Fill bags from smallest need to largest
        int fullBags = 0;
        for (int i = 0; i < n; i++) {
            if (additionalRocks >= need[i]) {
                additionalRocks -= need[i];
                fullBags++;
            } else {
                break; // no more rocks left
            }
        }

        return fullBags;
    }
}
