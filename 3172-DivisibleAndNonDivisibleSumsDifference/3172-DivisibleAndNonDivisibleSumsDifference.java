// Last updated: 8/14/2025, 11:17:31 AM
class Solution {
    public int differenceOfSums(int n, int m) {
        int totalSum = n * (n + 1) / 2;
        int count=n / m;
        int DivisibleSum = m * count * (count + 1) / 2;
        return totalSum - 2 * DivisibleSum;
    }
}
