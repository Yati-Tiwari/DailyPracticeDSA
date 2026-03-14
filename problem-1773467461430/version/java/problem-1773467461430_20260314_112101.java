// Last updated: 3/14/2026, 11:21:01 AM
1class Solution {
2    public String getHappyString(int n, int k) {
3        int x=(int)Math.pow(2, n-1);
4        if (k > 3 * x)
5            return "";
6        String[] s={ "bc", "ac", "ab" };
7        StringBuilder sb=new StringBuilder();
8        if(k<=x)
9            sb.append('a');
10        else if(k<=2 * x) {
11            sb.append('b');
12            k -= x;
13        }else {
14            sb.append('c');
15            k -= 2*x;
16        }
17        for(int i=1; i<n; i++) {
18            x /= 2;
19            String str=s[sb.charAt(sb.length()-1)-'a'];
20            if(k <=x)
21                sb.append(str.charAt(0));
22            else{
23                sb.append(str.charAt(1));
24                k -=x;
25            }
26        }
27        return sb.toString();
28    }
29}