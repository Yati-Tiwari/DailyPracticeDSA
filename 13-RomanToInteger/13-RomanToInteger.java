// Last updated: 8/14/2025, 11:27:31 AM
class Solution {
    public int romanToInt(String s) {
        char[] symbols={'I', 'V', 'X', 'L', 'C', 'D', 'M'};
        int[] values ={1, 5, 10, 50, 100, 500, 1000};
        int total=0;
        int prevValue=0;
        for (int i=s.length() - 1; i >= 0; i--) {
            char currentChar=s.charAt(i);
            int currentValue=0;
            for (int j=0; j < symbols.length; j++) {
                if (symbols[j] == currentChar) {
                    currentValue=values[j];
                    break;
                }
            }
            if (currentValue < prevValue) {
                total -= currentValue;
            } else {
                total += currentValue;
            }
            prevValue=currentValue;
        }
        return total;
    }
}
