// Last updated: 8/14/2025, 11:22:00 AM

class Solution {
    public List<String> letterCasePermutation(String s) {
        List<String> ll = new ArrayList<>();
        print(s, ll, "");
        return ll;
    }

    public static void print(String s, List<String> ll, String ans) {
        if (s.length() == 0) {
            ll.add(ans);
            return;
        }

        char ch = s.charAt(0);

        if (Character.isDigit(ch)) {
            print(s.substring(1), ll, ans + ch);
        } else if (Character.isUpperCase(ch)) {
            print(s.substring(1), ll, ans + ch);
            char Ch = (char) (ch + 32);
            print(s.substring(1), ll, ans + Ch);
        } else if (Character.isLowerCase(ch)) {
            print(s.substring(1), ll, ans + ch);
            char Ch = (char) (ch - 32);
            print(s.substring(1), ll, ans + Ch);

        }
    }
}