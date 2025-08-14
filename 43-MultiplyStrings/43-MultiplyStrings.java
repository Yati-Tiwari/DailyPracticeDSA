// Last updated: 8/14/2025, 11:27:04 AM
class Solution {
    public String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0")) 
        {
            return "0";
        }

        int m = num1.length(), n = num2.length();
        int[] product = new int[m + n];
        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                int mul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                int sum = mul + product[i + j + 1];
                product[i + j + 1] = sum % 10;
                product[i + j] += sum / 10;
            }
        }
        StringBuilder result = new StringBuilder();
        for (int num : product) {
            if (!(result.length() == 0 && num == 0)) {
                result.append(num);
            }
        }

        return result.toString();
    }
}
