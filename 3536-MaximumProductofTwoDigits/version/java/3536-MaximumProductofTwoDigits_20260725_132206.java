// Last updated: 7/25/2026, 1:22:06 PM
1import java.util.*;
2
3class Solution {
4    public int maxProduct(int n) {
5        String s=String.valueOf(n);
6        int[] a=new int[s.length()];
7        for(int i=0;i<s.length();i++) {
8            a[i]=s.charAt(i)-'0'; 
9        }
10        Arrays.sort(a);
11        int length=a.length;
12        int p=a[length-1] * a[length-2]; 
13        return p;
14    }
15}
16