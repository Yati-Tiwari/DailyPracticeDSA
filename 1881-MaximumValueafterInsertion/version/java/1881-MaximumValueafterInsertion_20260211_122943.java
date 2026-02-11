// Last updated: 2/11/2026, 12:29:43 PM
1class Solution {
2    public String maxValue(String n, int x) {
3        char digit=(char) ('0' + x);
4        StringBuilder sb=new StringBuilder();
5        if (n.charAt(0)=='-') {
6            sb.append('-');  //negative number case
7            boolean inserted=false;
8            for (int i=1; i<n.length(); i++) {
9                if (!inserted && digit <n.charAt(i)) {
10                    sb.append(digit);
11                    inserted=true;
12                }
13                sb.append(n.charAt(i));
14            }
15            if(!inserted){
16                sb.append(digit);
17            }
18        } else{
19            boolean inserted=false; //Positive number case
20            for(int i=0; i<n.length(); i++) {
21                if (!inserted && digit > n.charAt(i)){
22                    sb.append(digit);
23                    inserted=true;
24                }
25                sb.append(n.charAt(i));
26            }
27            if(!inserted){
28                sb.append(digit);
29            }
30        }
31        return sb.toString();
32    }
33}