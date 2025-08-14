// Last updated: 8/14/2025, 11:18:38 AM
class Solution {
    public int countAsterisks(String s) {
        int Count=0;
        int bars_Count=0;
        for (int i=0;i < s.length();i++) {
            char c=s.charAt(i);
            if (c == '|') {
                bars_Count++;
            } else if (c== '*' && bars_Count % 2 ==0) {
                Count++;
            }
        }
        return Count;
    }
}
