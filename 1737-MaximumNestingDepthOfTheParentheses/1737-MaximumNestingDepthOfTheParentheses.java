// Last updated: 8/14/2025, 11:19:42 AM
class Solution {
    public int maxDepth(String s) {
        int maxDepth = 0;
        int currentDepth = 0;

        for (char c : s.toCharArray()) {
            if (c == '(') {
                currentDepth++;
                maxDepth = Math.max(maxDepth, currentDepth);
            } else if (c == ')') {
                currentDepth--;
            }
        }

        return maxDepth;
    }
}
