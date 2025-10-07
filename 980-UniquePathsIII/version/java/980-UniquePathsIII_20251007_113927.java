// Last updated: 10/7/2025, 11:39:27 AM
class Solution {
    public long minimumTime(int[] time, int totalTrips) {
        // Find minimum time manually (no streams)
        int minTime = time[0];
        for (int i = 0; i < time.length; i++) {
            if (time[i] < minTime) {
                minTime = time[i];
            }
        }

        long left = 1;                 
        long right = (long) minTime * totalTrips;  
        long result = right;

        while (left <= right) {
            long mid = left + (right - left) / 2;
            if (canComplete(time, totalTrips, mid)) {
                result = mid;        // possible answer
                right = mid - 1;     // try smaller time
            } else {
                left = mid + 1;      // need more time
            }
        }

        return result;
    }
    private boolean canComplete(int[] time, int totalTrips, long t) {
        long trips = 0;
        for (int i = 0; i < time.length; i++) {   // classic for loop
            trips += t / time[i];   // trips completed by this bus
            if (trips >= totalTrips) {// enough trips
                return true; 
            }
        }
        return false;
    }
}
