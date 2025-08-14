// Last updated: 8/14/2025, 11:22:19 AM
class Solution {
    public String toLowerCase(String s) {
        StringBuilder result = new StringBuilder();       
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                c = (char) (c + ('a' - 'A'));
            }           
            result.append(c);
        }      
        return result.toString();
    }
}
