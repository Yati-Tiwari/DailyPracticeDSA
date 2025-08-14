// Last updated: 8/14/2025, 11:19:55 AM
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
