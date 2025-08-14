// Last updated: 8/14/2025, 11:21:01 AM
class Solution {
    public List<String> commonChars(String[] words) {
        int[] minFreq=new int[26];
        for (int i = 0; i < 26; i++) {
            minFreq[i] = Integer.MAX_VALUE;
        }
        for (int i = 0; i < words.length; i++) {
            int[] freq = new int[26];
            for (int j = 0; j < words[i].length(); j++) {
                char c = words[i].charAt(j);
                freq[c - 'a']++;
            }
            for (int k = 0; k < 26; k++) {
                if (minFreq[k] > freq[k]) {
                    minFreq[k] = freq[k];
                }
            }
        }
        List<String> result = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < minFreq[i]; j++) {
                result.add("" + (char)(i + 'a'));
            }
        }
        return result;
    }
}
