// Last updated: 12/21/2025, 8:34:54 PM
1class Solution {
2    public String longestNiceSubstring(String s) {
3        if (s.length() < 2){
4            return "";
5        }
6        boolean[] lower_arr=new boolean[26];
7        boolean[] upper_arr=new boolean[26];
8        for (int i=0;i<s.length();i++) {
9            char ch=s.charAt(i);
10            if (ch>='a' && ch<='z') {
11                lower_arr[ch-'a']=true;
12            } else {
13                upper_arr[ch-'A']=true;
14            }
15        }
16        for (int i=0;i<s.length();i++) {
17            char ch=s.charAt(i);
18            int indx=Character.toLowerCase(ch)-'a';
19            if (!(lower_arr[indx] && upper_arr[indx])) {
20                String left=longestNiceSubstring(s.substring(0,i));
21                String right=longestNiceSubstring(s.substring(i+1));
22                if(left.length()>=right.length()){
23                    return left;
24                }
25                else{
26                    return right;
27                }
28            }
29        }
30        return s;
31    }
32}
33