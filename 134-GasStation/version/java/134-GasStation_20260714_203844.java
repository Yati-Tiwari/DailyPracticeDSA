// Last updated: 7/14/2026, 8:38:44 PM
1class Solution {
2    public int canCompleteCircuit(int[] gas, int[] cost) {
3        int total=0;
4        for(int i=0;i<cost.length;i++){
5            total+=gas[i]-cost[i];
6        }
7        if(total<0){
8            return -1;
9        }
10        int idx=0;
11        int currentfuel=0;
12        for(int i=0;i<cost.length;i++){
13            currentfuel+=gas[i]-cost[i];
14            if(currentfuel < 0){
15                currentfuel=0;
16                idx=i+1;
17            }
18        }
19        return idx;
20    }
21}