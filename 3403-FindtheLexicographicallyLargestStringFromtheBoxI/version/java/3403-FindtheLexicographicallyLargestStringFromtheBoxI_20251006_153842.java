// Last updated: 10/6/2025, 3:38:42 PM
class Solution {
    public String makeGood(String s) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(!st.isEmpty() && Math.abs(st.peek()-c)==32){
                st.pop();
            }
            else{
                st.push(s.charAt(i));
            }
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<st.size();i++){
            sb.append(st.get(i));
        }
        return sb.toString();
    }
}