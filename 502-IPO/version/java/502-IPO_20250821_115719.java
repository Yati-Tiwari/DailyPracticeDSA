// Last updated: 8/21/2025, 11:57:19 AM
import java.util.Arrays;
import java.util.PriorityQueue;

class Solution {
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        int n=profits.length;
        int[][] arr=new int[n][2];
        for (int i = 0; i <n; i++) {
            arr[i][0]=capital[i];
            arr[i][1]=profits[i];
        }
        return IPO(arr, k, w);
    }
    public int IPO(int[][] arr, int k, int w) {
        Arrays.sort(arr, (a, b) -> a[0] - b[0]);
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> b[1] - a[1]);
        int i = 0;
        while (k > 0) {
            while (i < arr.length && arr[i][0] <= w) {
                pq.add(arr[i]);
                i++;
            }
            if (pq.isEmpty()) {
                break;
            }
            w += pq.poll()[1];
            k--;
        }
        return w;
    }
}
