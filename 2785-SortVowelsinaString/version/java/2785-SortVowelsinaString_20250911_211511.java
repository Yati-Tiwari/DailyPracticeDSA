// Last updated: 9/11/2025, 9:15:11 PM
class Solution {
    public String sortVowels(String s) {
        String vowels = "aeiouAEIOU";
        List<Character> v = new ArrayList<>();
        for (int i=0;i<s.length();i++) {
            char c=s.charAt(i);
            if (vowels.indexOf(c) != -1) {
                v.add(c);
            }
        }
        Collections.sort(v);
        StringBuilder ans = new StringBuilder();
        int idx = 0;
        for (int i=0;i<s.length();i++) {
            char c=s.charAt(i);
            if (vowels.indexOf(c) != -1) {
                ans.append(v.get(idx++));
            } else {
                ans.append(c); 
            }
        }
        return ans.toString();
    }
}
