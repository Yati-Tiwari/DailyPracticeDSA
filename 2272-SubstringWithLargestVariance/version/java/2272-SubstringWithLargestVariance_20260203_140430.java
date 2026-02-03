// Last updated: 2/3/2026, 2:04:30 PM
1class Solution {
2    public int largestVariance(String s) {
3        int[] f=new int[26];
4        for (int i=0; i<s.length();i++) {
5            f[s.charAt(i)-'a']++;
6        }
7        int rslt=0;
8        for (char c1='a'; c1<='z'; c1++) {
9            for (char c2='a'; c2<='z'; c2++) {
10                if (f[c1-'a']==0 || f[c2-'a']==0) {
11                    continue;
12                }
13                int x=0,y=0;
14                boolean z=false;
15                for (int i=0;i<s.length(); i++) {
16                    char ch=s.charAt(i);
17                    if (ch==c1){
18                        x++;
19                    }
20                    if (ch==c2){
21                        y++;
22                    }
23                    if (y> 0) {
24                        rslt=Math.max(rslt,x-y);
25                    } else {
26                        if (z){
27                            rslt=Math.max(rslt,x-1);
28                        }
29                    }
30                    if (y >x) {
31                        x=0;
32                        y=0;
33                        z=true;
34                    }
35                }
36            }
37        }
38        return rslt;
39    }
40}