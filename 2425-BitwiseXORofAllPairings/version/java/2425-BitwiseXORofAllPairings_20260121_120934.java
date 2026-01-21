// Last updated: 1/21/2026, 12:09:34 PM
1class Solution {
2    public int getXORSum(int[] arr1, int[] arr2) {
3        int xor1=0;
4        int xor2=0;
5        for(int v:arr1)xor1^=v;
6        for(int v:arr2)xor2^=v;
7        return xor1 & xor2;
8    }
9}