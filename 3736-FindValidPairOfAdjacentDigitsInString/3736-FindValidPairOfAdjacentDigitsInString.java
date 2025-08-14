// Last updated: 8/14/2025, 11:16:42 AM
class Solution {
    public String findValidPair(String s) {
        char[] sorted = s.toCharArray();
        Arrays.sort(sorted);  
        int n = s.length();
        int count = 1;
        int[] freq = new int[10]; 
        for (int i = 1; i < n; i++) {
            if (sorted[i] == sorted[i - 1]) {
                count++;
            } else {
                freq[sorted[i - 1] - '0'] = count;
                count = 1; 
            }
        }
        freq[sorted[n - 1] - '0'] = count;
        for (int i = 0; i < n - 1; i++) {
            char first = s.charAt(i);
            char second = s.charAt(i + 1);
            
            if (first != second && freq[first - '0'] == (first - '0') && freq[second - '0'] == (second - '0')) {
                return "" + first + second;
            }
        }
        return "";
    }
}
