// Last updated: 8/14/2025, 11:19:39 AM
public class Solution {
    public int countVowelStrings(int n) {
        return (int) ((long)(n+4) * (n+3) * (n+2) * (n+1)/24);
    }
}
