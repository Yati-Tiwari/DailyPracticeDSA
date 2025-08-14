// Last updated: 8/14/2025, 11:20:00 AM
class Solution {
    public int kthFactor(int n, int k) {
        for(int i=1;i<=n;i++){
            if(n%i==0){
                k--;
                if(k==0){
                    return i;
                }
            }
        }
         return -1;
    }
}