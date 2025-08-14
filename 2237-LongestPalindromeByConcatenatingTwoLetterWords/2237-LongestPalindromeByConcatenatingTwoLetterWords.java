// Last updated: 8/14/2025, 11:19:00 AM
class Solution {
    public int longestPalindrome(String[] words) {
        int[][] count_arr= new int[26][26];
        int len=0;
        for (int i = 0; i < words.length; i++) {
            String word=words[i];
            int a = word.charAt(0) - 'a';
            int b = word.charAt(1) - 'a';
            if (count_arr[b][a] > 0) {
                count_arr[b][a]--;
                len += 4;
            } else {
                count_arr[a][b]++;
            }
        }
        for (int i = 0; i < 26; i++) {
            if (count_arr[i][i] > 0) {
                len += 2;
                break;
            }
        }
        return len;
    }
}
