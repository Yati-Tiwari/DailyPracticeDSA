// Last updated: 11/30/2025, 8:54:37 AM
1class Solution {
2    public int maxDistinct(String s) {
3        boolean[] sen=new boolean[26];
4        int count=0;
5        for(int i=s.length()-1;i>=0;i--){
6            char rack=s.charAt(i);
7            int inx=rack-'a';
8            if(!sen[inx]){
9                sen[inx]=true;
10                count++;
11            }
12            
13        }
14        return count;
15    }
16}