// Last updated: 8/23/2025, 8:39:45 PM
class Solution {
    public int minSensors(int n, int m, int k) {
        int sidLegt = 2 * k + 4-3;
        int count = 0;
        for (int q = n - 1; q >= 0; q -= sidLegt) {
            for (int l = m - 1; l >= 0; l -= sidLegt) {
                count++;
            }
        }
        return count;
    }
}