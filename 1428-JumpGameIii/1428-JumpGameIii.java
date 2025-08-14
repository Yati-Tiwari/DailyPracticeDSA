// Last updated: 8/14/2025, 11:20:12 AM
class Solution {
    public boolean canReach(int[] arr, int start) {
        if (start<0 || start>=arr.length || arr[start]<0) {
            return false;
        }
        if (arr[start]==0) {
            return true;
        }
        int jump=arr[start];
        arr[start]=-arr[start];

        if (canReach(arr,start+jump)) {
            return true;
        }
        if (canReach(arr,start - jump)) {
            return true;
        }
        return false;
    }
}
