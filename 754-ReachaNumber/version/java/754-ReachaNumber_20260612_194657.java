// Last updated: 6/12/2026, 7:46:57 PM
1class Solution {
2    public int reachNumber(int target) {
3        target=Math.abs(target); 
4        int Sum=0;
5        int Steps=0;
6        while(Sum<target || (Sum-target) % 2!=0){
7            Steps++;
8            Sum+=Steps;
9        }
10        return Steps;
11    }
12}
13