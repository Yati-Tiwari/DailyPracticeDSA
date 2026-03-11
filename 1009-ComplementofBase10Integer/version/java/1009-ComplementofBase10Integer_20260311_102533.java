// Last updated: 3/11/2026, 10:25:33 AM
1class Solution {
2    public int bitwiseComplement(int n) {
3        if(n==0){
4            return 1;  
5        }
6        // Find the number of bits in n
7        int mask=1;
8        while (mask <=n) {
9            mask=mask<<1;
10        }
11        // Subtract 1 to make mask all 1s in the range of n
12        mask -=1;
13        // XOR with mask to flip bits
14        return n ^ mask;
15    }
16}