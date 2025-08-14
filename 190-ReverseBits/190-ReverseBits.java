// Last updated: 8/14/2025, 11:25:26 AM
public class Solution {
    public int reverseBits(int n) {
        int Result=0;
        for (int i=0; i<32; i++) {
            Result <<= 1;         
            Result |= (n&1);      
            n >>>= 1;             
        }
        return Result;
    }
}
