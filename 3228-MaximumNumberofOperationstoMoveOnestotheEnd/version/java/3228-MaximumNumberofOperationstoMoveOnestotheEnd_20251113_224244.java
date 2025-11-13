// Last updated: 11/13/2025, 10:42:44 PM
class Solution {
    public int maxOperations(String s) {
        int ones=0;
        int ans=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='1'){
                ones++;
            }else{
                if(i==s.length()-1 || s.charAt(i+1)=='1'){
                    ans+=ones;
                }
            }
        }
        return ans;
    }
}