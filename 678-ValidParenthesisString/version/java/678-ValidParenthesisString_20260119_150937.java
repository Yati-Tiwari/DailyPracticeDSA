// Last updated: 1/19/2026, 3:09:37 PM
1class Solution {
2    public boolean checkValidString(String s) {
3        int p1=0;
4        int p2=0;
5        for(int i=0;i<s.length();i++){
6            char ch=s.charAt(i);
7            if(ch=='('){
8                p1++;
9                p2++;
10            }else if(ch==')'){
11                if(p1>0){
12                    p1--;
13                }
14                p2--;
15            }else{
16                if(p1>0){ 
17                    p1--;
18                }
19                p2++; //let it oopen 
20            }
21        if(p2<0) return false;
22        }
23        return p1==0;
24    }
25}