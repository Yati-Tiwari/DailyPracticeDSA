// Last updated: 8/14/2025, 11:20:04 AM
class Solution {
    public int maxPower(String s) {
        int count=1;
        int max_count=1;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==s.charAt(i-1)){
                count++;
                max_count=Math.max(max_count,count);
            }
            else{
                count=1;
            }
        }
        return max_count;
    }
}