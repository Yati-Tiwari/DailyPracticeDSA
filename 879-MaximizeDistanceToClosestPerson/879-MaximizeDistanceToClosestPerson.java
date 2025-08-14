// Last updated: 8/14/2025, 11:21:47 AM
class Solution {
    public int maxDistToClosest(int[] seats) {
        int Maximum_Distance=0;
        int lastOccupied = -1;
        int n=seats.length;
        for (int i=0; i < n; i++) {
            if (seats[i]==1) {
                if (lastOccupied==-1) {
                    Maximum_Distance = i;
                } else {
                    Maximum_Distance=Math.max(Maximum_Distance,(i-lastOccupied) / 2);
                }
                lastOccupied=i;
            }
        }
        Maximum_Distance=Math.max(Maximum_Distance, n-1 - lastOccupied);
        return Maximum_Distance;
    }
}
