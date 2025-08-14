// Last updated: 8/14/2025, 11:23:57 AM
public class Solution {
    public String originalDigits(String s) {
        int[] freq=new int[26], cnt = new int[10];
        for (int i=0; i < s.length(); i++) {
            char ch=s.charAt(i);
            freq[ch - 'a']++;
        }
        cnt[0] = freq['z' - 'a'];
        cnt[2] = freq['w' - 'a'];
        cnt[4] = freq['u' - 'a'];
        cnt[6] = freq['x' - 'a'];
        cnt[8] = freq['g' - 'a'];

        cnt[1] = freq['o' - 'a'] - cnt[0] - cnt[2] - cnt[4];
        cnt[3] = freq['h' - 'a'] - cnt[8];
        cnt[5] = freq['f' - 'a'] - cnt[4];
        cnt[7] = freq['s' - 'a'] - cnt[6];
        cnt[9] = freq['i' - 'a'] - cnt[5] - cnt[6] - cnt[8];
        StringBuilder sb=new StringBuilder();
        for (int d=0; d < 10; d++) {
            for (int k = 0; k < cnt[d]; k++) {
                sb.append((char)('0' + d));
            }
        }
        return sb.toString();
    }
}
