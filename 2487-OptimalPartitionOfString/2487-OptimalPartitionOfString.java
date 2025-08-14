// Last updated: 8/14/2025, 11:18:20 AM
class Solution {
    public int partitionString(String s) {
        int[] last=new int[26];
        for (int i=0; i < 26; i++) {
            last[i] = -1;
        }
        int count=1;
        int start=0;
        for (int i=0; i < s.length(); i++) {
            char ch=s.charAt(i);
            if (last[ch-'a'] >= start) {
                count++;
                start=i;
            }
            last[ch-'a'] = i;
        }
        return count;
    }
}
