// Last updated: 12/22/2025, 12:32:45 PM
1class Solution {
2    public boolean isLongPressedName(String name, String typed) {
3        int i=0;
4        int n=name.length();
5        int t=typed.length();
6        for(int j=0;j<t;j++){
7            if(i<n&& name.charAt(i)==typed.charAt(j)){
8                i++;
9            }
10            else if(j==0 || typed.charAt(j)!=typed.charAt(j-1)){
11                return false;
12            }
13        }
14        if(i==n){
15            return true;
16        }
17        return false;
18    }
19}