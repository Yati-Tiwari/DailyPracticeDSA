// Last updated: 8/14/2025, 11:19:06 AM
class Solution {
    public boolean checkAlmostEquivalent(String word1, String word2) {
        int[] Arr1=new int[26];
        int[] Arr2=new int[26];
        for(int i=0;i<word1.length();i++){
            Arr1[word1.charAt(i)-'a']++;
        }
        for(int i=0;i<word2.length();i++){
            Arr2[word2.charAt(i)-'a']++;
        }
        for(int i=0;i<26;i++){
            if(Math.abs(Arr1[i]-Arr2[i])>3){
                return false;

            }
        }
        return true;
    }
}