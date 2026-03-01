// Last updated: 3/1/2026, 7:44:03 PM
1class Solution {
2    public int minPartitions(String n) {
3        int maxDigit=0;
4        for(int i=0; i<n.length(); i++) {
5            int dgt=n.charAt(i) - '0';  // char to int conversion
6            if(dgt > maxDigit) {
7                maxDigit=dgt;
8            }
9            if(maxDigit==9){
10                return 9; // optimization
11            }
12        }
13        return maxDigit;
14    }
15}