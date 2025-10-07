// Last updated: 10/7/2025, 12:01:51 PM
class Solution {
    public String answerString(String word, int numFriends) {
        int n=word.length();
        if(numFriends==1) {
            return word;
        }

        String ans="";
        int max=n-(numFriends-1);
        for(int i=0;i<n;i++){
            int len=Math.min(n-i,max);
            String sub=word.substring(i,i+len);
            if(ans.compareTo(sub)<0){
                ans=sub;
            }
        }
        return ans;
    }
}