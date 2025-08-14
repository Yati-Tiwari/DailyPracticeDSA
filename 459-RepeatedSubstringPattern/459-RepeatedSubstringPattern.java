// Last updated: 8/14/2025, 11:23:45 AM
class Solution {
    public boolean repeatedSubstringPattern(String s) {
        String doubled=s+s;
        String SubString=doubled.substring(1,doubled.length()-1);
        return SubString.contains(s);
    }
    
}