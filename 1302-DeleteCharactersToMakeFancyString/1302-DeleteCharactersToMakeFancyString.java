// Last updated: 8/14/2025, 11:20:28 AM
class Solution {
    public String makeFancyString(String s) {
        StringBuilder sb = new StringBuilder();
        char prev = 0;
        int count = 0;
        int n=s.length();
        for (int i=0;i<n;i++) {
            char ch=s.charAt(i);
            if (ch==prev) {
                count++;
            } else {
                prev=ch;
                count=1;
            }
            if (count <= 2) {
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}
