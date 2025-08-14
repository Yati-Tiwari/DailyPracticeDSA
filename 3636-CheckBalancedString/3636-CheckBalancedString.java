// Last updated: 8/14/2025, 11:16:51 AM
class Solution {
    public boolean isBalanced(String num) {
        int n = num.length();
        int evensum = 0;
        int oddsum = 0;
        for (int i = 0; i < n; i++) {
            int digit = Character.getNumericValue(num.charAt(i));
            if (i % 2 == 0) {
                evensum += digit;
            } else {
                oddsum += digit;
            }
        }
        return evensum == oddsum;
    }
}
