// Last updated: 8/14/2025, 11:18:01 AM
class Solution {
    public int alternateDigitSum(int n) {
        int sum = 0;
        String str = Integer.toString(n);
        for (int i = 0; i < str.length(); i++) {
            int digit = str.charAt(i) - '0';
            if (i % 2 == 0) {
                sum += digit; 
            } else {
                sum -= digit; 
            }
        }        
        return sum;
    }
}
