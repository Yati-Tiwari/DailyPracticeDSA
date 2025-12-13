// Last updated: 12/13/2025, 9:17:40 PM
1class Solution {
2    public boolean checkValidString(String s) {
3        int minOpen=0;
4        int maxOpen=0;
5        for(int i=0;i<s.length();i++){
6            char ch=s.charAt(i);
7            if (ch=='(') {
8                minOpen++;
9                maxOpen++;
10            } else if (ch==')') {
11                minOpen--;
12                maxOpen--;
13            } else { 
14                minOpen--;
15                maxOpen++;
16            }
17            if (maxOpen<0){
18                return false;
19            }
20            if (minOpen < 0){
21                minOpen=0;
22            }
23        }
24        if(minOpen==0){
25            return true;
26        }
27        return false;
28    }
29}
30