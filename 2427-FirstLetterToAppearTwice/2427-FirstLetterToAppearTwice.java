// Last updated: 8/14/2025, 11:18:35 AM
class Solution {
    public char repeatedCharacter(String s) {
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            for(int j=0;j<i;j++){
                if(s.charAt(j)==ch){
                    return ch;
                }
            }
        }
        return ' ';
    }
}