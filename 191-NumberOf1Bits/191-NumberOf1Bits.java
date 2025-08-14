// Last updated: 8/14/2025, 11:25:24 AM
public class Solution {
    public static int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            count += n & 1;
            n >>>= 1;
        }
        return count;
    }
   
}
