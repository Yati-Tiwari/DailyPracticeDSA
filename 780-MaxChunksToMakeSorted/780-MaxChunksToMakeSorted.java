// Last updated: 8/14/2025, 11:22:07 AM
class Solution {
    public int maxChunksToSorted(int[] arr) {
        int chunks=0;
        int MaxSoFar=0;
        for (int i=0; i < arr.length; i++) {
            MaxSoFar = Math.max(MaxSoFar, arr[i]);
            if (MaxSoFar==i) {
                chunks++;
            }
        }
        return chunks;
    }
}
