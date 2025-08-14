// Last updated: 8/14/2025, 11:19:41 AM
class Solution {
    public int countSubstrings(String s, String t) {
        int count=0;
        for (int i=0; i < s.length(); i++) {
            for (int j=0; j < t.length(); j++) {
                int diff=0;
                for (int k=0; i + k < s.length() && j + k < t.length(); k++) {
                    if (s.charAt(i + k) != t.charAt(j + k)) {
                        diff++;
                    }
                    if (diff > 1) 
                    {
                        break;
                    }
                    if (diff==1) {
                        count++;
                    }
                }
            }
        }
        return count;
    }
}
