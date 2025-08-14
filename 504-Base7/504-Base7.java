// Last updated: 8/14/2025, 11:23:29 AM
class Solution {
    public String convertToBase7(int num) {
        if (num==0) {
            return "0";
        }
        String ans="";
        boolean negative=false;
        if (num < 0) {
            negative=true;
            num=-num;
        }
        while (num > 0) {
            int digit = num % 7;
            ans=digit+ans; 
            num = num / 7;
        }
        if (negative) {
            ans= "-" + ans;
        }
        return ans;
    }
}
