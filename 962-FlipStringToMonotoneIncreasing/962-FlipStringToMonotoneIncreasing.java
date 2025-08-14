// Last updated: 8/14/2025, 11:21:26 AM
class Solution {
    public int minFlipsMonoIncr(String s) {
        int Flips=0;
        int ones=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                ones++;
            }
            else{
                Flips=Math.min(Flips+1,ones);
            }
        }
        return Flips;
    }
}