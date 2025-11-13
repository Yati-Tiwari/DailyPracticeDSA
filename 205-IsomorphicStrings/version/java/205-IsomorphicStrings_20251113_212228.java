// Last updated: 11/13/2025, 9:22:28 PM
class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()){
            return false;
        }
        int[] Map_S = new int[256];
        int[] Map_T = new int[256];
        for (int i=0; i<s.length();i++) {
            if (Map_S[s.charAt(i)] != Map_T[t.charAt(i)]){
                return false;
            }
                Map_S[s.charAt(i)]=i+1;
                Map_T[t.charAt(i)]=i+1;
        }
        return true;
    }
}
