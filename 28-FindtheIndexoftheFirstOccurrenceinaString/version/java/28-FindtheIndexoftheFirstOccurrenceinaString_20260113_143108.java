// Last updated: 1/13/2026, 2:31:08 PM
1class Solution {
2    public int strStr(String haystack, String needle) {
3        if(needle.length()==0){
4            return 0;
5        }
6        for(int i=0;i<=haystack.length()-needle.length();i++){
7            if(haystack.substring(i,i+needle.length()).equals(needle)){
8                return i;
9            }
10        }
11        return -1;
12    }
13}