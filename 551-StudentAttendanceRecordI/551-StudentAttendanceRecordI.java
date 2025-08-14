// Last updated: 8/14/2025, 11:23:17 AM
class Solution {
    public boolean checkRecord(String s) {
        int absentCount = 0;
        int lateStreak = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'A') {
                absentCount++;
                if (absentCount > 1) {
                    return false;
                }
                lateStreak = 0; 
            } else if (c == 'L') {
                lateStreak++;
                if (lateStreak > 2) 
                {
                    return false;
                }
            } else {
                lateStreak = 0; 
            }
        }

        return true;
    }
}
