// Last updated: 8/14/2025, 11:17:19 AM
class Solution {
    public int minimumPushes(String word) {
        int[] count = new int[26];
        for (int i=0;i<word.length();i++) {
            char ch=word.charAt(i);
            int index=ch - 'a';
            count[index]++;
        }
        Arrays.sort(count);
        int Pushes=0;
        for (int i = 0; i < 26;i++) {
            Pushes += count[25 - i] * (i / 8 + 1);
        }
        return Pushes;
    }
}
