// Last updated: 8/14/2025, 11:19:18 AM
public class Solution {
    public String replaceDigits(String s) {
        String result="";
        for (int i=0;i<s.length();i++) {
            char ch=s.charAt(i);         
            if (i%2==0) {
                result+=ch;
            } else {
                int shift=ch-'0';
                char prevChar=s.charAt(i - 1);
                char newChar=(char)(prevChar + shift);
                result+=newChar;
            }
        }
        return result;
    }
}
