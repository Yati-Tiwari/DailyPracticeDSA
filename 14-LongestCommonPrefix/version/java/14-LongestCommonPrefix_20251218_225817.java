// Last updated: 12/18/2025, 10:58:17 PM
1class Solution {
2    public String longestCommonPrefix(String[] strs) {
3        Arrays.sort(strs);
4        String s1=strs[0];
5        String s2=strs[strs.length-1];
6        int index=0;
7        while(index<s1.length() && index<s2.length()){
8            if(s1.charAt(index)==s2.charAt(index)){
9                index++;
10            }
11            else{
12                break;
13            }
14        }
15        String ans=s1.substring(0,index);
16        return ans;
17    }
18}