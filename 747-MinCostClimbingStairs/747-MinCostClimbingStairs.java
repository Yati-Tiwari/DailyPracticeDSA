// Last updated: 8/14/2025, 11:22:16 AM
class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n=cost.length;
        for (int i=2;i<n;i++) {
            cost[i] += Math.min(cost[i-1],cost[i-2]);
        }
        int answer=Math.min(cost[n-1],cost[n-2]);
        return answer;
    }
}
