// Last updated: 12/27/2025, 5:48:09 PM
1class Solution {
2    public String resultingString(String s) {
3        StringBuilder stack_arr=new StringBuilder();
4        for (int i=0;i<s.length();i++) {
5            char ch=s.charAt(i);
6            int n=stack_arr.length();
7            if (n > 0 && areConsecutive(stack_arr.charAt(n-1),ch)) {
8                stack_arr.deleteCharAt(n-1);  
9            } else {
10                stack_arr.append(ch); 
11            }
12        }
13        return stack_arr.toString();
14    }
15    public boolean areConsecutive(char a, char b) {
16        return Math.abs(a-b)==1 || (a=='a' && b=='z') || (a=='z' && b=='a');
17    }
18}
19  