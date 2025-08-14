// Last updated: 8/14/2025, 11:19:21 AM
class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        if(s1.equals(s2)){
            return true;
        }
        if(s1.length()!=s2.length()){
            return false;
        }
        int count=0;
        int[] freq1=new int[26];
        int[] freq2=new int[26];
        for(int i=0;i<s1.length();i++){
            freq1[s1.charAt(i)-'a']++;
        }
        for(int i=0;i<s2.length();i++){
            freq2[s2.charAt(i)-'a']++;
        }
        for(int i=0;i<26;i++){
            if(freq1[i]!=freq2[i]){
                return false;
            }
        }
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                count++;
            }
        }
        if(count==0 || count==2){
            return true;
        }else{
            return false;
        }
    }
}