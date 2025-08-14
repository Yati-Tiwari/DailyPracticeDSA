// Last updated: 8/14/2025, 11:19:01 AM
public class Solution {
    public String addSpaces(String s, int[] spaces) {
        int totalLength=s.length() + spaces.length;
        char[] result=new char[totalLength];      
        int spacePtr=0;  
        int resPtr=0;    
        for (int i=0;i<s.length();i++) {
            if (spacePtr < spaces.length && i==spaces[spacePtr]) {
                result[resPtr++]=' ';
                spacePtr++;
            }
            result[resPtr++]=s.charAt(i);
        }
        return new String(result);
    }
}
