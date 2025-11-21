// Last updated: 11/21/2025, 7:54:29 PM
class Solution {
    public String removeDuplicateLetters(String s) {
        int[] Last=new int[26];
        for (int i=0; i < s.length(); i++) {
            Last[s.charAt(i) - 'a']=i;
        }
        boolean[] in_Stack = new boolean[26];
        char[] stack=new char[s.length()];
        int Top = -1;
        for (int i=0; i<s.length(); i++) {
            char ch=s.charAt(i);
            if (in_Stack[ch - 'a']) {
                continue;
            }
            while (Top >= 0 && stack[Top] > ch && Last[stack[Top] - 'a'] > i) {
                in_Stack[stack[Top] - 'a']=false;
                Top--;
            }
            stack[++Top] = ch;
            in_Stack[ch - 'a'] = true;
        }   
        StringBuilder sb=new StringBuilder();
        for (int i=0; i <= Top; i++) {
            sb.append(stack[i]);
        }
        return sb.toString();
    }
}