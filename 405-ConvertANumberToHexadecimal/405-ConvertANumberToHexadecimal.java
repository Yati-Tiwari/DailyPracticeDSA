// Last updated: 8/14/2025, 11:24:07 AM
class Solution {
    public String toHex(int num) {
        if (num==0) {
            return "0";
        }
        char[] hex_Chars = "0123456789abcdef".toCharArray();
        StringBuilder sb = new StringBuilder();
        while (num != 0) {
            int hexDigit = num & 0xf;  
            sb.append(hex_Chars[hexDigit]);
            num >>>= 4;  
        }
        return sb.reverse().toString();
    }
}
