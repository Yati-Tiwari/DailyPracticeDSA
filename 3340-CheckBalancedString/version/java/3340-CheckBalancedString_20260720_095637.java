// Last updated: 7/20/2026, 9:56:37 AM
1class Solution {
2    public boolean isBalanced(String num) {
3        int n=num.length();
4        int evensum=0;
5        int oddsum = 0;
6        for (int i = 0; i < n; i++) {
7            int digit = Character.getNumericValue(num.charAt(i));
8            if (i % 2==0) {
9                evensum += digit;
10            } else {
11                oddsum +=digit;
12            }
13        }
14        return evensum==oddsum;
15    }
16}