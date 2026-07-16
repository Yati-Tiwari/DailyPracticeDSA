// Last updated: 7/16/2026, 8:53:08 AM
1class Solution {
2    public String countAndSay(int n) {
3        if(n==1) 
4        {
5            return "1";
6        }
7        String prevSequence=countAndSay(n-1);
8        StringBuilder rslt=new StringBuilder();
9        int cnt=1;
10        for(int i=1;i<prevSequence.length(); i++){
11            if(prevSequence.charAt(i)==prevSequence.charAt(i-1)) {
12                cnt++;
13            }else {
14                rslt.append(cnt).append(prevSequence.charAt(i-1));
15                cnt=1;
16            }
17        }
18        rslt.append(cnt).append(prevSequence.charAt(prevSequence.length()-1));
19        return rslt.toString();
20    }
21}