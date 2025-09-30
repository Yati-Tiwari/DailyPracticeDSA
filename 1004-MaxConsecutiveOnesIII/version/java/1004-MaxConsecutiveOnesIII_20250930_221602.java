// Last updated: 9/30/2025, 10:16:02 PM
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        if (s.length() < p.length()) return result;
        int[] pCount = new int[26];
        int[] sCount = new int[26];
        // Count frequency of characters in p
        for (int i = 0; i < p.length(); i++) {
            pCount[p.charAt(i) - 'a']++;
            sCount[s.charAt(i) - 'a']++; // first window in s
        }
        // Check first window
        if (Arrays.equals(pCount, sCount)) {
            result.add(0);
        }
        // Sliding window
        for (int i = p.length(); i < s.length(); i++) {
            // Add new char in window
            sCount[s.charAt(i) - 'a']++;
            // Remove old char from window
            sCount[s.charAt(i - p.length()) - 'a']--;
            // Compare
            if (Arrays.equals(pCount, sCount)) {
                result.add(i - p.length() + 1);
            }
        }
        return result;
    }
}
