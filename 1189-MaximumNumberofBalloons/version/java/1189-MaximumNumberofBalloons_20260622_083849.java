// Last updated: 6/22/2026, 8:38:49 AM
1class Solution {
2    public int maxNumberOfBalloons(String text) {
3        int[] count=new int[26];
4        for (int i=0; i < text.length(); i++) {
5            char ch=text.charAt(i);
6            count[ch - 'a']++;
7        }
8        int b = count['b' - 'a'];
9        int a = count['a' - 'a'];
10        int l = count['l' - 'a'] / 2;
11        int o = count['o' - 'a'] / 2;
12        int n = count['n' - 'a'];
13        return Math.min(Math.min(Math.min(b, a), Math.min(l, o)), n);
14    }
15}
16