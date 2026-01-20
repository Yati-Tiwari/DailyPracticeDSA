// Last updated: 1/20/2026, 3:33:44 PM
1class Solution {
2    public int longestValidParentheses(String s) {
3        int n=s.length();
4        int a=0;
5        int b=0;
6        int ans=0;
7        for(int i=0;i<n;i++){
8            int ch=s.charAt(i);
9            if(ch=='('){
10                a++;
11            }
12            else {
13                b++;
14            }
15
16            if(a==b){
17                ans=Math.max(ans,a*2);
18
19            }
20            else if(b>a){
21                a=0;
22                b=0;
23            }
24            
25        }
26        a=0;
27        b=0;
28        for(int i=n-1;i>=0;i--){
29            int ch=s.charAt(i);
30            if(ch=='('){
31                a++;
32            }
33            else {
34                b++;
35            }
36
37            if(a==b){
38                ans=Math.max(ans,a*2);
39
40            }
41            else if(a>b){
42                a=0;
43                b=0;
44            }
45            
46        }
47        return ans;
48    }
49}