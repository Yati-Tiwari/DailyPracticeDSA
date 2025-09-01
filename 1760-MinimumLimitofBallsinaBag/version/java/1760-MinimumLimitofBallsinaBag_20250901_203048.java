// Last updated: 9/1/2025, 8:30:48 PM
class Solution {
    public String findLongestWord(String s, List<String> dict) {
        int Max = 0; 
        String answer= "";
        for (String curr : dict) {
            int X = 0;
            for (int j = 0; j < s.length(); j++) { 
                if (X < curr.length() && curr.charAt(X) == s.charAt(j)) {
                    X++;
                }
            }
            if (X == curr.length()) { 
                if (curr.length() > Max) {
                    Max = curr.length(); 
                    answer = curr;
                } else if (curr.length() == Max) {
                    if (curr.compareTo(answer) < 0) {
                        answer = curr;
                    }
                }
            }
        }
        return answer;
    }
}