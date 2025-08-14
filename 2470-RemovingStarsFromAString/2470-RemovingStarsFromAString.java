// Last updated: 8/14/2025, 11:18:27 AM
class Solution {
    public String removeStars(String s) {
        char[] RESULT=new char[s.length()];
        int index=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='*'){
                index--;
            }
            else{
                RESULT[index++]=ch;
            }
        }
        String final_ans=new String(RESULT,0,index);
        return final_ans;
    }
}