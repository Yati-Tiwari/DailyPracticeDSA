// Last updated: 3/5/2026, 6:13:09 PM
1class Solution {
2    public int minOperations(String s) {
3        int n=s.length();
4        int count1=0; // mismatches if starting with '0'
5        int count2=0; // mismatches if starting with '1'
6        for(int i=0; i < n; i++){
7            char c=s.charAt(i);
8            if(i % 2==0) {
9                if(c!='0'){
10                    count1++;
11                }
12                if(c!='1'){
13                    count2++;
14                }
15            } else {
16                if(c!='1') {
17                    count1++;
18                }
19                if(c!='0') {
20                    count2++;
21                }
22            }
23        }
24        if(count1<count2) {
25            return count1;
26        }else {
27            return count2;
28        }
29    }
30}