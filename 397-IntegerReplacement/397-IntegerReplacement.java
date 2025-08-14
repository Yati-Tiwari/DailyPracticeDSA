// Last updated: 8/14/2025, 11:24:11 AM
class Solution {
    public int integerReplacement(int n) {
        int Count=0;
        long nums=n;
        while (nums != 1) {
            if ((nums & 1) == 0) {
                nums=nums/2;
            } else {
                if (nums == 3 || ((nums & 2) == 0)) {
                    nums--;
                } else {
                    nums++;
                }
            }
            Count++;
        }
        return Count;
    }
}
