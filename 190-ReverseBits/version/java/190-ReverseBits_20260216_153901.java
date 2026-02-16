// Last updated: 2/16/2026, 3:39:01 PM
1public class Solution {
2    public int reverseBits(int n) {
3        int Result=0;
4        for (int i=0; i<32; i++) {
5            Result <<= 1;         
6            Result |= (n&1);      
7            n >>>= 1;             
8        }
9        return Result;
10    }
11}
12