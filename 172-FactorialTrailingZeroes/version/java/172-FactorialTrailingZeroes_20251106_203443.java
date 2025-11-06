// Last updated: 11/6/2025, 8:34:43 PM
class Solution {
    public int trailingZeroes(int n) {
        int count = 0;
       while(n>0){
        n/=5;
        count+=n;
       }
       return count;
    }
    
}