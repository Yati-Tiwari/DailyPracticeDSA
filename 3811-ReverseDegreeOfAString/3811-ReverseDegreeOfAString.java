// Last updated: 8/14/2025, 11:16:33 AM
class Solution {
    public int reverseDegree(String s) {
        int Sum=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            Sum=Sum+(26-(ch-'a'))*(i+1);
        }
        return Sum;
    }
}