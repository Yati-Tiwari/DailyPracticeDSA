// Last updated: 8/14/2025, 11:21:20 AM
class Solution {
    public int[] diStringMatch(String s) {
        int[] answer=new int[s.length()+1];
        int c=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='I'){
                answer[i]=c;
                c++;
            }
        }
        answer[s.length()]=c++;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)=='D'){
                answer[i]=c++;
            }
        }
        return answer;
    }
}