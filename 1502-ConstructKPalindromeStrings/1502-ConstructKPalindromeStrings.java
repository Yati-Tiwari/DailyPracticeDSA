// Last updated: 8/14/2025, 11:20:06 AM
 class Solution {
    public boolean canConstruct(String s, int k) {
        if (s.length()<k) {
            return false;
        }
        int[] frequency=new int[26];
        for (int i=0; i < s.length(); i++) {
            char ch=s.charAt(i);
            frequency[ch-'a']++;
        }
        int odd_Count = 0;
        for (int i=0; i < 26; i++) {
            if (frequency[i] % 2 != 0) {
                odd_Count++;
            }
        }
        if (odd_Count <= k) {
            return true;
        } else {
            return false;
        }
    }
}
