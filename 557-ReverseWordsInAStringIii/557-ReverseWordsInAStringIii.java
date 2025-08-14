// Last updated: 8/14/2025, 11:23:14 AM
public class Solution {
    public String reverseWords(String s) {
        char[] arr = s.toCharArray();
        int start = 0;
        for (int end = 0; end <= arr.length; end++) {
            if (end == arr.length || arr[end] == ' ') {
                int left = start, right = end - 1;
                while (left < right) {
                    char temp = arr[left];
                    arr[left++] = arr[right];
                    arr[right--] = temp;
                }
                start = end + 1;
            }
        }
        return new String(arr);
    }
}
