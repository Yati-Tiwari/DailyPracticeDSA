// Last updated: 10/11/2025, 8:34:51 PM
class Solution {
    public boolean scoreBalance(String s) {
        int[] f=new int[26];
        int RT=0;
        for(int i=0;i<s.length();i++){
            RT+=(s.charAt(i)-'a'+1);
        }
        int Ls=0;
        for(int i=0;i<s.length()-1;i++){
            f[s.charAt(i)-'a']++;
            Ls+=(s.charAt(i)-'a'+1+2-2);
            if(Ls*2== RT){
                return true;
            }
        }
        return false;
        
    }
}