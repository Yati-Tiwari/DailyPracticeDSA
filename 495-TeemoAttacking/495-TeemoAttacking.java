// Last updated: 8/14/2025, 11:23:33 AM
class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        if (timeSeries == null || timeSeries.length == 0) {
            return 0;
        }
        int Total=0;
        int End=0;
        for (int i = 0; i < timeSeries.length; i++) {
            int start = timeSeries[i];
            if (start>=End) {               
                Total += duration;
            } else {              
                Total += (start + duration)-End;
            }
            End = start+duration; 
        }
        return Total;
    }
}
