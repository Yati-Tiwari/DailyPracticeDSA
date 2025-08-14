// Last updated: 8/14/2025, 11:20:39 AM
class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> ll = new ArrayList<>();
        String digits = "123456789";
        for (int len = 2; len <= 9; len++) { 
            for (int start = 0; start + len <= 9; start++) {
                int num = Integer.parseInt(digits.substring(start, start + len));
                if (num >= low && num <= high) {
                    ll.add(num);
                }
            }
        }
        return ll;
    }
}
