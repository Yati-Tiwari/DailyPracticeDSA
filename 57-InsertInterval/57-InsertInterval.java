// Last updated: 8/14/2025, 11:26:51 AM
class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> Answer = new ArrayList<>();
        int i=0;
        int N=intervals.length;
        while (i < N && intervals[i][1] < newInterval[0]) {
            Answer.add(intervals[i]);
            i++;
        }
        while (i < N && intervals[i][0] <= newInterval[1]) {
            newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
            newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
            i++;
        }
        Answer.add(newInterval);
        while (i < N) {
            Answer.add(intervals[i]);
            i++;
        }
       int[][] resultArray = new int[Answer.size()][];
       resultArray = Answer.toArray(resultArray);
       return resultArray;
    }

}
