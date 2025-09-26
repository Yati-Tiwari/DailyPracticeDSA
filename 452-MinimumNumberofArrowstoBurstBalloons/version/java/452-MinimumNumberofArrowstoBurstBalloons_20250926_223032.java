// Last updated: 9/26/2025, 10:30:32 PM
class Solution {
    public int findMinArrowShots(int[][] points) {
        if (points.length == 0) {
            return 0;
        }
        Arrays.sort(points, (a, b) -> Integer.compare(a[0], b[0]));
        int arrows=1;
        int curr_End=points[0][1];
        for (int i=1; i < points.length; i++) {
            if (points[i][0] <= curr_End) {
                curr_End = Math.min(curr_End, points[i][1]);
            } else {
                arrows++;
                curr_End = points[i][1];
            }
        }
        return arrows;
    }
}
