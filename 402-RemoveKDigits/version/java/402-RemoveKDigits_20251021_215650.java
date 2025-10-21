// Last updated: 10/21/2025, 9:56:50 PM
class Solution {
    public String removeDuplicates(String s, int k) {
        int n=s.length();
        char[] st=new char[n];
        int[] count=new int[n];
        int top = -1;
        for (int i=0; i < n; i++) {
            char ch=s.charAt(i);

            if (top >= 0 && st[top] == ch) {
                count[top]++;
            } else {
                top++;
                st[top] = ch;
                count[top] = 1;
            }

            if (count[top] == k) {
                top--; // remove k duplicates
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i=0; i <= top; i++) {
            for (int j=0; j < count[i]; j++) {
                sb.append(st[i]);
            }
        }

        return sb.toString();
    }
}
