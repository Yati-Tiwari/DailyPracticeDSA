// Last updated: 2/19/2026, 8:17:55 PM
1class Solution {
2    public int countBinarySubstrings(String s) {
3        int prev=0;
4        int curr=1;
5        int count=0;
6        for (int i=1; i<s.length(); i++) {
7            if (s.charAt(i)==s.charAt(i-1)) {
8                curr++;
9            } else {
10                count+=Math.min(prev,curr);
11                prev=curr;
12                curr=1;
13            }
14        }
15        int ans=count +Math.min(prev,curr);
16        return ans;
17    }
18}
19