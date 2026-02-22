// Last updated: 2/22/2026, 6:57:34 PM
1class Solution {
2    public int binaryGap(int n) {
3        int last=-1;   //position of last '1'
4        int maxGap=0;  //maximum gap found
5        int pos=0;     //current bit position 
6        while(n>0) {
7            if((n & 1)==1){ // check if current bit is '1'
8                if(last!=-1) {
9                    maxGap=Math.max(maxGap,pos-last);
10                }
11                last=pos;
12            }
13            n>>=1; // shift right
14            pos++;
15        }
16        return maxGap;
17    }
18}