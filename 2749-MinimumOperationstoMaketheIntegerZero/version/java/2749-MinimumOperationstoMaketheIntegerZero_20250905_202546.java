// Last updated: 9/5/2025, 8:25:46 PM
class Solution {
    public int makeTheIntegerZero(int num1, int num2) {
        for (int i= 0; i <= 60; i++) {
            long target = num1 - (long)i * num2;
            if (target < i) {
                continue; 
            }
            if (Long.bitCount(target) <= i) {
                return i;
            }
        }
        return -1;
    }
}
