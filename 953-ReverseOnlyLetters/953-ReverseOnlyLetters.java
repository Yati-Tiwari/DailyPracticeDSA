// Last updated: 8/14/2025, 11:21:29 AM
class Solution {
    public String reverseOnlyLetters(String s) {
        char[] chars = s.toCharArray();
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            while (left < right && !Character.isLetter(chars[left])) 
            {
                left++;
            }
            while (left < right && !Character.isLetter(chars[right]))
            {
              right--;
            }
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
        return new String(chars);
    }
}
