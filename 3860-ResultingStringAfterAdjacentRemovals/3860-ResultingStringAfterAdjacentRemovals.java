// Last updated: 8/14/2025, 11:16:28 AM
class Solution {
    public String resultingString(String s) {
        StringBuilder stack_arr = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch=s.charAt(i);
            int n=stack_arr.length();
            if (n > 0 && areConsecutive(stack_arr.charAt(n - 1), ch)) {
                stack_arr.deleteCharAt(n - 1);  
            } else {
                stack_arr.append(ch); 
            }
        }
        return stack_arr.toString();
    }
    public boolean areConsecutive(char a, char b) {
        return Math.abs(a-b)==1 || (a=='a' && b=='z') || (a=='z' && b =='a');
    }
}
  