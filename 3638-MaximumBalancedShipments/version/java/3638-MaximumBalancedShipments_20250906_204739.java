// Last updated: 9/6/2025, 8:47:39 PM
class Solution {
    public int maxBalancedShipments(int[] weight) {
        int Count=0;
        int i=0;
        int n=weight.length;
        while (i < n) {
            int currentMax = weight[i];
            boolean flag = false;
            for (int j = i+1; j < n; j++) {
                currentMax = Math.max(currentMax, weight[j]);
                if (weight[j] < currentMax) {
                    Count++;
                    i = j+1; 
                    flag=true;
                    break;
                }
            }
            if (!flag) {
                break; 
            }
        }
        return Count;
    }
}