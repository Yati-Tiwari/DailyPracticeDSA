// Last updated: 8/14/2025, 11:22:37 AM
class Solution {
    public int maximumSwap(int num) {
        char[] digits=Integer.toString(num).toCharArray();
        int[] last_Index = new int[10];
        for (int i = 0; i < digits.length; i++) {
            last_Index[digits[i] - '0'] = i;
        }
        for (int i = 0; i < digits.length; i++) {
            for (int j = 9; j > digits[i] - '0'; j--) {
                if (last_Index[j] > i) {
                    char temp = digits[i];
                    digits[i] = digits[last_Index[j]];
                    digits[last_Index[j]] = temp;
                    return Integer.parseInt(new String(digits));
                }
            }
        }
        return num;
    }
}
