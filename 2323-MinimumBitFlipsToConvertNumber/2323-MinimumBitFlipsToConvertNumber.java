// Last updated: 8/14/2025, 11:18:45 AM
class Solution {
    public int minBitFlips(int start, int goal) {
        int Xor=start ^ goal;
        int Count=0;
        while (Xor != 0) {
            Count += (Xor & 1);
            Xor >>= 1;
        }
        return Count;
    }
}
