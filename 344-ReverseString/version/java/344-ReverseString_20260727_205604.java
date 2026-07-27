// Last updated: 7/27/2026, 8:56:04 PM
1class Solution {
2    public void reverseString(char[] s) {
3        int l=0,r=s.length-1;
4        while(l<r){
5            char temp=s[l];
6            s[l]=s[r];
7            s[r]=temp;
8            l++;
9            r--;
10        }
11    }
12}