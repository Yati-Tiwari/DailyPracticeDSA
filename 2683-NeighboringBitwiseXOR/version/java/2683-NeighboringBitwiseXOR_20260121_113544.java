// Last updated: 1/21/2026, 11:35:44 AM
1class Solution {
2    public boolean doesValidArrayExist(int[] derived) {
3        int n=derived.length;
4        int xor=0;
5        for(int v:derived){
6            xor^=v;
7        }
8        return xor==0;
9
10    }
11}