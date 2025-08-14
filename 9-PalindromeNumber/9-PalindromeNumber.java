// Last updated: 8/14/2025, 11:27:35 AM
class Solution {
    public boolean isPalindrome(int x) {
         if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        int sum=0;
        int temp=x;
        while(x!=0){
            int rem=x%10;
            sum=sum*10+rem;
            x=x/10;
        }
        if(temp==sum){
            return true;
        }
        return false;


    }
    
}