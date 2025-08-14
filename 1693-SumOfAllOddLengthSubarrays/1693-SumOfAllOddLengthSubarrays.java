// Last updated: 8/14/2025, 11:19:45 AM
class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int total=0;
        int n=arr.length;
        for (int i=0;i < n;i++) {
            int end=i+1;
            int start=n-i;
            int totalSubarrays=end * start;
            int oddCount=(totalSubarrays+1) / 2;
            total+=oddCount * arr[i];
        }
        return total;
    }
}
