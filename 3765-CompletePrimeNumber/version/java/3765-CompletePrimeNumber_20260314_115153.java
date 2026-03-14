// Last updated: 3/14/2026, 11:51:53 AM
1class Solution {
2    public String reversePrefix(String s, int k) {
3        StringBuilder sb=new StringBuilder(s);
4        int left = 0;
5        int right = k - 1;
6        while (left < right) {
7            char temp = sb.charAt(left);
8            sb.setCharAt(left, sb.charAt(right));
9            sb.setCharAt(right, temp);
10            left++;
11            right--;
12        }
13        return sb.toString();
14    }
15}