// Last updated: 11/10/2025, 8:55:38 PM
class Solution {
    public int minCost(String colors, int[] neededTime) {
        int TotalTime=0;
        int n=colors.length();
        for (int i=1;i<n;i++) {
            if (colors.charAt(i)==colors.charAt(i-1)) {
                TotalTime += Math.min(neededTime[i], neededTime[i-1]);
                neededTime[i]=Math.max(neededTime[i], neededTime[i-1]);
            }
        }
        return TotalTime;
    }
}
