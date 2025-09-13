// Last updated: 9/13/2025, 11:02:34 AM
class Solution {
    public int maxFreqSum(String s) {
        String vowel="aeiouAEIOU";
        int[] freq=new int[128];
        int maxvowel=0;
        int maxconsonant=0;
        for(int i=0;i<s.length();i++){
            int c=s.charAt(i);
            if(Character.isLetter(c)){
                freq[c]++;
                if(vowel.indexOf(c) != -1){
                    maxvowel=Math.max(maxvowel,freq[c]);
                }
                else{
                    maxconsonant=Math.max(maxconsonant,freq[c]);
                }
            }
        }
        int ans=maxvowel + maxconsonant;
        return ans;
    }
}