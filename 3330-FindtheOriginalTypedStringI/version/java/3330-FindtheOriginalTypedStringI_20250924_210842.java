// Last updated: 9/24/2025, 9:08:42 PM
class Solution {
    public int possibleStringCount(String word) {
        int count=0;
        for(int i=1;i<word.length();i++){
            if(word.charAt(i) == word.charAt(i-1)){
                count++;
            }
        }
        return count +1; 
    }
}