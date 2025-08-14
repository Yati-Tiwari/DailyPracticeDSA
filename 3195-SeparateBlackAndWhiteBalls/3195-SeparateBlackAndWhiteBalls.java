// Last updated: 8/14/2025, 11:17:29 AM
class Solution {
    public long minimumSteps(String s) {
        long Swap_Count=0;
        int Black_Ball_Count=0;
        for(int i=0;i<s.length();i++){
            char ball=s.charAt(i);
            if(ball=='1'){
                Black_Ball_Count++;
            }
            else{
                Swap_Count+=Black_Ball_Count;
            }
        }
        return Swap_Count;
    }
}