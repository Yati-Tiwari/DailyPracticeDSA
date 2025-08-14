// Last updated: 8/14/2025, 11:19:04 AM
class Solution {
    public long countVowels(String word) {
        int n=word.length();
        long Count=0;
        for (int i=0; i < n; i++) {
            char ch=word.charAt(i);
            if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
                Count += (long)(i+1) * (n-i);
            }
        }
        return Count;
    }
}
