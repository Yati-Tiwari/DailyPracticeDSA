// Last updated: 8/14/2025, 11:23:43 AM
class Solution {
    public int hammingDistance(int x, int y) {
        int xor = x ^ y; 
        int distance = 0;
        while (xor != 0) {
            distance += xor & 1; 
            xor >>= 1; 
        }

        return distance;
    }
}
