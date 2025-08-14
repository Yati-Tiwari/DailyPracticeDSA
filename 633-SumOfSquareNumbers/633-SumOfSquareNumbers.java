// Last updated: 8/14/2025, 11:22:46 AM
class Solution {
    public boolean judgeSquareSum(int c) {
        int a=0;
        int b=0;
        while ((long)b * b<=c) {
            b++;
        }
        b--;
        while (a<=b) {
            long sum=(long)a * a+(long)b * b;
            if (sum==c) {
                return true;
            } else if (sum < c) {
                a++;
            } else {
                b--;
            }
        }
        return false;
    }
}
