// Last updated: 8/14/2025, 11:17:56 AM
import java.util.Arrays;

class Solution {
    public long repairCars(int[] ranks, int cars) {
        Arrays.sort(ranks);
        long left = 1;
        long right = (long) ranks[0] * (long) cars * cars;

        while (left < right) {
            long mid = left + (right - left) / 2;
            long totalCars = 0;

            for (int i = 0; i < ranks.length; i++) {
                totalCars += Math.sqrt(mid / ranks[i]);
                if (totalCars >= cars) {
                    break;
                }
            }

            if (totalCars >= cars)
            {
              right = mid;
            }
            else{
                 left = mid + 1;
            }
        }

        return left;
    }
}
