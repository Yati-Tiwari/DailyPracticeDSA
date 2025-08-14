// Last updated: 8/14/2025, 11:19:11 AM
public class Solution {
    public String removeOccurrences(String s, String part) {
        StringBuilder result = new StringBuilder();
        
        int i = 0;
        while (i < s.length()) {
            result.append(s.charAt(i));
            if (result.length() >= part.length() && result.substring(result.length() - part.length()).equals(part)) {
                result.delete(result.length() - part.length(), result.length());
            }
            i++;
        }
        
        return result.toString();
    }
}
