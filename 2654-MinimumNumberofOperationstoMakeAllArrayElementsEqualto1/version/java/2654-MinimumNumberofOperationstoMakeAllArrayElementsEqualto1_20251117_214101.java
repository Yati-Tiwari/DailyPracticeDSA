// Last updated: 11/17/2025, 9:41:01 PM
class Solution {
    public int smallestNumber(int n) {
        int x=1;
        while (x-1 < n) {
            x <<= 1;  
        }
        int ans=x-1;
        return ans;
    }
}
