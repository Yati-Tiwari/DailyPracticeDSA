// Last updated: 8/14/2025, 11:24:35 AM
class Solution {
    public int[] countBits(int n) {
        int[] Answer=new int[n + 1];
        for (int i=1; i<=n; i++) {
            Answer[i] = Answer[i >> 1] + (i & 1);
        }
        return Answer;
    }
}
