// Last updated: 9/29/2025, 2:18:12 PM
class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int total=0;
        for(int i=0;i<cost.length;i++){
            total+=gas[i]-cost[i];
        }
        if(total<0){
            return -1;
        }
        int idx=0;
        int currentfuel=0;
        for(int i=0;i<cost.length;i++){
            currentfuel+=gas[i]-cost[i];
            if(currentfuel < 0){
                currentfuel=0;
                idx=i+1;
            }
        }
        return idx;
    }
}