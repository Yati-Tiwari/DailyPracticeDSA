// Last updated: 4/20/2026, 7:50:17 PM
1class Solution {
2    public int maxDistance(int[] A) {
3        int j=A.length;
4        for(int i=0;i<j;i++){
5            if(A[i] != A[j-1] || A[j-1-i] !=A[0]){
6                return j-1-i;
7            }
8        }
9        return 0;
10    }
11}