// Last updated: 10/1/2025, 9:23:54 PM
class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[1]-b[1]); // sort by end
        int Removals=0;
        int End=intervals[0][1];
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] < End) {
                // overlap => remove this one
                Removals++;
            } else {
                // no overlap => keep it
                End=intervals[i][1];
            }
        }
        return Removals;
    }
}
