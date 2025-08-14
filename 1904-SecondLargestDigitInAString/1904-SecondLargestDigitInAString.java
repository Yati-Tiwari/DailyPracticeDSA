// Last updated: 8/14/2025, 11:19:24 AM
class Solution {
    public int secondHighest(String s) {
        int First_Max=-1;
        int Second_Max=-1;      
        for (int i=0; i < s.length();i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                int digit=c - '0';
                if (digit>First_Max) {
                    Second_Max=First_Max;
                    First_Max = digit;
                } else if (digit > Second_Max && digit < First_Max) {
                    Second_Max = digit;
                }
            }
        }       
        return Second_Max;
    }
}
