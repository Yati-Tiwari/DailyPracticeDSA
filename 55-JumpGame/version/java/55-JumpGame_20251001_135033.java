// Last updated: 10/1/2025, 1:50:33 PM
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        int[] freq1=new int[128];
        int[] freq2=new int[128];
        for(int i=0;i<s.length();i++){
            freq1[s.charAt(i)]++;
            freq2[t.charAt(i)]++;
        }
        return Arrays.equals(freq1,freq2);
    }
}