// Last updated: 8/14/2025, 11:19:25 AM
class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder answer = new StringBuilder();
        int i=0;
        while(i<word1.length() || i<word2.length()){
            if(i<word1.length()){
                answer.append(word1.charAt(i));
            }
            if(i<word2.length()){
                answer.append(word2.charAt(i));
            }
            i++;
        }
        return answer.toString();
    }
}