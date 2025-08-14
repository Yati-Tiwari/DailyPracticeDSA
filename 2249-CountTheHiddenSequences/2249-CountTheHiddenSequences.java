// Last updated: 8/14/2025, 11:18:57 AM
class Solution {
    public int numberOfArrays(int[] differences, int lower, int upper) {
        long Sum=0;
        long Min=0;
        long Max=0;
        for (int i=0;i<differences.length;i++) {
            Sum+=differences[i];
            if (Sum<Min) {
                Min=Sum;
            }
            if (Sum>Max) {
                Max=Sum;
            }
        }
        long range=(long) upper - lower;
        long Possible_Starts=range-(Max-Min) + 1;
        if (Possible_Starts < 0) {
            return 0;
        } else {
            return (int) Possible_Starts;
        }
    }
}
