// Last updated: 7/14/2026, 8:41:26 PM
1class Solution {
2    public int canCompleteCircuit(int[] gas, int[] cost) {
3        int total=0;
4        for(int i=0;i<cost.length;i++){
5            total+=gas[i]-cost[i];
6        }
7        if(total<0){
8            return -1;
9        }
10        int start=0,sum=0;
11        for(int i=0;i<cost.length;i++){
12            sum+=gas[i]-cost[i];
13            if(sum<0){
14                sum=0;
15                start=1+i;
16                
17            }
18
19        }
20        return start;
21    }
22}