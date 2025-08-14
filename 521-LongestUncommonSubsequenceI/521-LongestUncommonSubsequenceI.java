// Last updated: 8/14/2025, 11:23:23 AM
class Solution {
    public int findLUSlength(String a, String b) {
        if (a.equals(b)) {
            return -1;
        } else {
            int answer= Math.max(a.length(), b.length());
            return answer;           
        }
    }
}
