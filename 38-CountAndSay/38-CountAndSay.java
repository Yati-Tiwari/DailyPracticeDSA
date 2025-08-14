// Last updated: 8/14/2025, 11:27:10 AM
class Solution {
    public String countAndSay(int n) {
        if (n == 1) 
        {
            return "1";
        }
        String previousSequence = countAndSay(n - 1);
        StringBuilder result = new StringBuilder();
        int count = 1;
        for (int i = 1; i < previousSequence.length(); i++) {
            if (previousSequence.charAt(i) == previousSequence.charAt(i - 1)) {
                count++;
            } else {
                result.append(count).append(previousSequence.charAt(i - 1));
                count = 1;
            }
        }
        result.append(count).append
        (previousSequence.charAt(previousSequence.length() - 1));
        return result.toString();
    }
}
