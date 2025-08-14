// Last updated: 8/14/2025, 11:18:34 AM
class Solution {
    public int maximumGroups(int[] grades) {
        Arrays.sort(grades);
        int Count=0;
        int Total=0;
        for (int i = 1; Total + i <= grades.length; i++) {
            Total += i;
            Count++;
        }
        return Count;
    }
}
