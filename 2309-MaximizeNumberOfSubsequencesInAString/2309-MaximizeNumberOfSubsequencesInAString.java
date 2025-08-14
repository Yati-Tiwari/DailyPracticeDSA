// Last updated: 8/14/2025, 11:18:46 AM
class Solution {
    public long maximumSubsequenceCount(String text, String pattern) {
        long count_1=0;
        long count_2=0;
        long Result=0;
        for (int i=0; i < text.length(); i++) {
            if (text.charAt(i)==pattern.charAt(1)) {
                Result += count_1;
                count_2++;
            }
            if (text.charAt(i)==pattern.charAt(0)) {
                count_1++;
            }
        }
        long option1=Result + count_2;
        long option2=Result + count_1;
        return Math.max(option1, option2);
    }
}
