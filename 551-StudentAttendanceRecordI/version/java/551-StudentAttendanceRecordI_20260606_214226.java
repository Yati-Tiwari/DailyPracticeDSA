// Last updated: 6/6/2026, 9:42:26 PM
1class Solution {
2    public boolean checkRecord(String s) {
3        int absentCount = 0;
4        int lateStreak = 0;
5        for (int i = 0; i < s.length(); i++) {
6            char c = s.charAt(i);
7            if (c == 'A') {
8                absentCount++;
9                if (absentCount > 1) {
10                    return false;
11                }
12                lateStreak = 0; 
13            } else if (c == 'L') {
14                lateStreak++;
15                if (lateStreak > 2) 
16                {
17                    return false;
18                }
19            } else {
20                lateStreak = 0; 
21            }
22        }
23
24        return true;
25    }
26}
27