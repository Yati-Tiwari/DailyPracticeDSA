// Last updated: 8/14/2025, 11:18:59 AM
class Solution {
    public boolean isSameAfterReversals(int num) {
        if(num==0){
            return true;
        }
        return num%10 != 0;
        
    }
}