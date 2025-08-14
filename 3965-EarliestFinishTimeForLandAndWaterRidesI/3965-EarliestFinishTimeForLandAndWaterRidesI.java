// Last updated: 8/14/2025, 11:16:25 AM
class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int G=landStartTime.length;
        int H=waterStartTime.length;
        int minimum_FnshTime=Integer.MAX_VALUE;
        for (int K=0; K < G; K++) {
            for (int L=0; L < H; L++) {
                int landFnsh=landStartTime[K] + landDuration[K];
                int waterStartAfterLand = Math.max(landFnsh, waterStartTime[L]);
                int fnshTime1=waterStartAfterLand + waterDuration[L]; 
                int waterFnsh=waterStartTime[L] + waterDuration[L];
                int landStartAfterWater = Math.max(waterFnsh, landStartTime[K]);
                int fnshTime2=landStartAfterWater+landDuration[K];
                int currentMin=Math.min(fnshTime1,fnshTime2);
                minimum_FnshTime=Math.min(minimum_FnshTime, currentMin);
            }
        }
        return minimum_FnshTime;
    }
}
