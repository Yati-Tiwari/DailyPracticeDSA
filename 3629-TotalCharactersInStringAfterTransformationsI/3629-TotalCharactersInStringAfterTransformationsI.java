// Last updated: 8/14/2025, 11:16:52 AM
class Solution {
    public int lengthAfterTransformations(String s, int t) {
        int MOD = 1_000_000_007;
        long[] Freq = new long[26];
        for (int i = 0; i < s.length(); i++) {
            Freq[s.charAt(i) - 'a']++;
        }
        for (int stepi = 0; stepi < t; stepi++) {
            long[] NewFreq = new long[26];
            for (int i = 0; i < 25; i++) {
                NewFreq[i + 1] = (NewFreq[i + 1] + Freq[i]) % MOD;
            }
            NewFreq[0] = (NewFreq[0] + Freq[25]) % MOD;
            NewFreq[1] = (NewFreq[1] + Freq[25]) % MOD;
            Freq = NewFreq;
        }

        long result = 0;
        for (int i = 0; i < 26; i++) {
            result = (result + Freq[i]) % MOD;
        }

        return (int) result;
    }
}
