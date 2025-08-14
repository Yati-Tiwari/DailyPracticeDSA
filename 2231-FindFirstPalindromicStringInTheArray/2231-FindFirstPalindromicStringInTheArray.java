// Last updated: 8/14/2025, 11:19:03 AM
class Solution {
    public String firstPalindrome(String[] words) {
        String result = "";     
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            boolean isPalin = true;
            for (int left = 0; left < word.length() / 2; left++) {
                int right = word.length() - 1 - left;
                if (word.charAt(left) != word.charAt(right)) {
                    isPalin = false;
                    break;
                }
            }
            if (isPalin) {
                result = word;
                break;
            }
        }
        return result;
    }
}