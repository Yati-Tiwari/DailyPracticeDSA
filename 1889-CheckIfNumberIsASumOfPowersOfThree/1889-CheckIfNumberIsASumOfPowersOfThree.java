// Last updated: 8/14/2025, 11:19:28 AM
class Solution {
    public boolean checkPowersOfThree(int n) {
        while(n>0){
            if(n%3==2){
                return false;
            }
           n/=3;
        }
        return true;
    }
}