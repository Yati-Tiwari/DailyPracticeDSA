// Last updated: 9/1/2025, 8:15:07 PM
class Solution {
    public int longestContinuousSubstring(String s) {
        int count=1;
        int curr=1;
        for(int i=1;i<s.length();i++){
            if((s.charAt(i)-'a')-(s.charAt(i-1)-'a')==1){
                curr++;
            }else{
                count=Math.max(curr,count);
                curr=1;
            }
        }
        count=Math.max(curr,count);
        return count;
    }
}