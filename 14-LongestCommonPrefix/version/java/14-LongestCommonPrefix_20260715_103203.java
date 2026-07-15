// Last updated: 7/15/2026, 10:32:03 AM
1class Solution {
2    public String longestCommonPrefix(String[] strs) {
3        Arrays.sort(strs);
4        String s1=strs[0];
5        String s2=strs[strs.length-1];
6        int idx=0;
7        while(idx<s1.length() && idx<s2.length()){
8            if(s1.charAt(idx)==s2.charAt(idx)){
9                idx++;
10            }else{
11                break;
12            }
13        }
14        String ans=s1.substring(0,idx);
15        return ans;
16
17    }
18}