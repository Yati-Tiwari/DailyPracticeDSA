// Last updated: 8/14/2025, 11:17:34 AM
class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count=0;
        for (int num=low; num <= high; num++) {
            int digits = countDigits(num);
            if (digits % 2 != 0) {
                continue;
            }
            int[] digitArr=new int[digits];
            int temp = num;
            for (int i = digits - 1; i >= 0; i--) {
                digitArr[i] = temp % 10;
                temp = temp / 10;
            }
            int sum1 = 0;
            int sum2 = 0;
            for (int i = 0; i < digits / 2; i++) {
                sum1 += digitArr[i];
            }
            for (int i = digits / 2; i < digits; i++) {
                sum2 += digitArr[i];
            }
            if (sum1 == sum2) {
                count++;
            }
        }

        return count;
    }
    public int countDigits(int num) {
        int digits = 0;
        while (num > 0) {
            num = num / 10;
            digits++;
        }
        return digits;
    }
}
