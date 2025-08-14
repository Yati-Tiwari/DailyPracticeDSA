// Last updated: 8/14/2025, 11:21:44 AM
class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Integer>st=new Stack<>();
        int current=0;
        for(char c:s.toCharArray() ){
            if(c=='('){
                st.push(current);
                current=0;
            }
            else{
                current=st.pop()+Math.max(2*current,1);
            }
        }
        return current;
    }
}