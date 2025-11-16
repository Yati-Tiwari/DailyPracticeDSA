// Last updated: 11/16/2025, 9:33:02 AM
class Solution {
    public int numSub(String s) {
        long count=0;
        long result=0;
        int MOD=1_000_000_007;
        for (int i=0;i<s.length();i++) {
            char c=s.charAt(i);
            if (c=='1') {
                count++;
                result=(result + count) % MOD;
            } else {
                count=0;
            }
        }

        return (int) result;
    }
}
