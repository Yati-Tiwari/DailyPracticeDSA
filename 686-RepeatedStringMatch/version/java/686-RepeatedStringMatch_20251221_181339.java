// Last updated: 12/21/2025, 6:13:39 PM
1class Solution {
2    public int repeatedStringMatch(String a, String b) {
3        StringBuilder sb = new StringBuilder(a);
4        int ans=1;
5        while (sb.length() < b.length()) {
6            sb.append(a);
7            ans++;
8        }
9        if (sb.indexOf(b)!=-1){
10            return ans;
11        }
12        sb.append(a);
13        if (sb.indexOf(b)!=-1){
14            return ans+1;
15        }
16        return -1;
17    }
18}
19