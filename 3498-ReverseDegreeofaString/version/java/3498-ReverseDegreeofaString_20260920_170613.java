// Last updated: 9/20/2026, 5:06:13 PM
1class Solution {
2    public int reverseDegree(String s) {
3        int Sum=0;
4        for(int i=0;i<s.length();i++){
5            char ch=s.charAt(i);
6            Sum=Sum+(26-(ch-'a'))*(i+1);
7        }
8        return Sum;
9    }
10}