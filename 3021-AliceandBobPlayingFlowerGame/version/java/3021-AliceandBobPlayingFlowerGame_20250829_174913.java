// Last updated: 8/29/2025, 5:49:13 PM
class Solution {
    public long flowerGame(int n, int m) {
        long odd_N=(n+1)/2;
        long even_N=n/2;
        long odd_M=(m+1)/2;
        long even_M=m/2;
        return odd_N*even_M+odd_M*even_N;
    }
}