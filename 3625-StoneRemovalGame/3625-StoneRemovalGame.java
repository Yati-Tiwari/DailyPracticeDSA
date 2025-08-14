// Last updated: 8/14/2025, 11:16:54 AM
class Solution {
    public boolean canAliceWin(int n) {
        int stonesToRemove = 10;
        boolean isAliceTurn = true;

        while (n > 0) {
            if (n < stonesToRemove) {
                return !isAliceTurn;
            }
            n -= stonesToRemove;
            stonesToRemove--;
            isAliceTurn = !isAliceTurn;
        }
        return !isAliceTurn;
    }
}
