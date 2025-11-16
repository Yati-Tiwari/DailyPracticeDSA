// Last updated: 11/16/2025, 12:39:48 PM
class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int n=matrix.length;
        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a,b) -> a[0] - b[0]
        );

        for (int i=0; i < n; i++) {
            pq.add(new int[]{matrix[i][0], i,0});
        }
        int ans=0;
        while (k-- > 0) {
            int[] curr = pq.poll();
            ans=curr[0];
            int r=curr[1];
            int c=curr[2];
            if (c + 1 < matrix[r].length) {
                pq.add(new int[]{matrix[r][c + 1], r, c + 1});
            }
        }
        return ans;
    }
}
