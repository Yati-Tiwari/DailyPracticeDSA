// Last updated: 12/24/2025, 6:36:22 PM
1class Solution {
2    public String smallestString(String s) {
3        int i=0;
4        int n=s.length();
5        char[] ch=s.toCharArray();
6        while(i<ch.length && ch[i]=='a'){
7            i++;
8        }
9        if(i==ch.length){
10            ch[ch.length-1]='z';
11            return new String(ch);
12        }
13        while(i<ch.length && ch[i]!='a'){
14            ch[i]--;
15            i++;
16        }
17        return new String(ch);
18        
19    }
20}