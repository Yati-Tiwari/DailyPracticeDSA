// Last updated: 8/14/2025, 11:21:56 AM
class Solution {
    public String customSortString(String order, String s) {
        int[] Count = new int[26];
        for (int i=0; i < s.length();i++) {
            Count[s.charAt(i)-'a']++;
        }
        StringBuilder ANs= new StringBuilder();
        for (char ch : order.toCharArray()) {
            while (Count[ch-'a'] > 0) {
                ANs.append(ch);
                Count[ch- 'a']--;
            }
        }
        for (char ch='a';ch <= 'z';ch++) {
            while (Count[ch- 'a'] > 0) {
                ANs.append(ch);
                Count[ch-'a']--;
            }
        }
        String finalResult =ANs.toString();
        return finalResult;
    }
}
