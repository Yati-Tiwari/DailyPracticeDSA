// Last updated: 8/14/2025, 11:19:15 AM
class Solution {
    public int longestBeautifulSubstring(String word) {
        int maxLength=0;
        int count_Vowels=1; 
        int start=0;
        for (int i=1; i < word.length(); i++) {
            char previous=word.charAt(i - 1);
            char current=word.charAt(i);
            if (current < previous) {
                start=i;
                count_Vowels=1;
            } else if (current > previous) {
                count_Vowels++;
            }
            if (count_Vowels == 5) {
                maxLength= Math.max(maxLength, i - start + 1);
            }
        }
        return maxLength;
    }
}
