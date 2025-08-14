// Last updated: 8/14/2025, 11:22:33 AM
class Solution {
    public boolean hasAlternatingBits(int n) {
        n ^= (n >> 1);
        return (n & (n + 1))==0;
    }
}
