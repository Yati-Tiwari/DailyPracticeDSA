// Last updated: 2/26/2026, 9:11:30 PM
1class Solution {
2    public int numSteps(String s) {
3        int carry=0;
4        int steps=0;
5        for(int i=s.length()-1; i>0; i--){
6            if((s.charAt(i)-'0') + carry==1){
7                // Odd +1 then divide
8                steps+=2;
9                carry=1; 
10            }else{
11                // Even ,divide
12                steps+=1;
13            }
14        }
15        // If carry remains ,one extra step
16        return steps+carry;
17    }
18}